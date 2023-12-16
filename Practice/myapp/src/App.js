import ChildComponent from './Child';
// const data = "MohaN"
import State from './state';
import BooleanStateComponent from './boolean';
import Disp from './class';
const ParentComponent = () => {
const a=10;
  return (
    <>
    <h3>
      <ChildComponent x="firstchild" y="my" />
    </h3>
    <State/>
    <BooleanStateComponent/>
    <Disp />
    </>
  )
}


export default ParentComponent;