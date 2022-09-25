package androidx.navigation.fragment;

import android.support.p031v4.app.C0260w;
import android.util.Log;
import androidx.lifecycle.C2382m;
import androidx.lifecycle.C2389t;
import androidx.lifecycle.C2391v;
import androidx.navigation.C3892m;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final /* synthetic */ class DialogFragmentNavigator$$ExternalSyntheticLambda1 implements C2389t {

    /* renamed from: a */
    public /* synthetic */ C3879c f12449a;

    public /* synthetic */ DialogFragmentNavigator$$ExternalSyntheticLambda1(C3879c cVar) {
        this.f12449a = cVar;
    }

    /* renamed from: eN */
    public final void mo416eN(C2391v vVar, C2382m mVar) {
        Object obj;
        C3879c cVar = this.f12449a;
        C69664n.m101061g(cVar, "this$0");
        if (mVar == C2382m.ON_CREATE) {
            C0260w wVar = (C0260w) vVar;
            Iterable<C3892m> iterable = (Iterable) cVar.mo8120f().f12436f.mo62784e();
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                for (C3892m mVar2 : iterable) {
                    if (C69664n.m101066l(mVar2.f12480e, wVar.getTag())) {
                        return;
                    }
                }
            }
            wVar.dismiss();
        } else if (mVar == C2382m.ON_STOP) {
            C0260w wVar2 = (C0260w) vVar;
            if (!wVar2.requireDialog().isShowing()) {
                List list = (List) cVar.mo8120f().f12436f.mo62784e();
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        obj = null;
                        break;
                    }
                    obj = listIterator.previous();
                    if (C69664n.m101066l(((C3892m) obj).f12480e, wVar2.getTag())) {
                        break;
                    }
                }
                if (obj != null) {
                    C3892m mVar3 = (C3892m) obj;
                    if (!C69664n.m101066l(C69540x.m100824F(list), mVar3)) {
                        Log.i("DialogFragmentNavigator", "Dialog " + wVar2 + " was dismissed while it was not the top of the back stack, popping all dialogs above this dismissed dialog");
                    }
                    cVar.mo8123i(mVar3, false);
                    return;
                }
                throw new IllegalStateException("Dialog " + wVar2 + " has already been popped off of the Navigation back stack");
            }
        }
    }
}
