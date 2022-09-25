package androidx.navigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.navigation.p178a.C3801a;
import androidx.p060c.C0985o;
import androidx.p060c.C0986p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p5462h.p5463a.C69531o;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.p5476a.C69640a;
import p5462h.p5482l.C69734n;

/* renamed from: androidx.navigation.bb */
/* compiled from: PG */
public final class C3834bb extends C3825ax implements Iterable, C69640a {

    /* renamed from: m */
    public static final /* synthetic */ int f12373m = 0;

    /* renamed from: a */
    public final C0985o f12374a = new C0985o(10);

    /* renamed from: b */
    public int f12375b;

    /* renamed from: l */
    public String f12376l;

    public C3834bb(C3868ci ciVar) {
        super(ciVar);
    }

    /* renamed from: a */
    public final void mo8035a(Context context, AttributeSet attributeSet) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(attributeSet, "attrs");
        super.mo8035a(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C3801a.f12273d);
        C69664n.m101060f(obtainAttributes, "context.resources.obtain…vGraphNavigator\n        )");
        int resourceId = obtainAttributes.getResourceId(0, 0);
        if (resourceId != this.f12360i) {
            this.f12375b = resourceId;
            this.f12376l = null;
            this.f12376l = C3823av.m11044b(context, resourceId);
            obtainAttributes.recycle();
            return;
        }
        throw new IllegalArgumentException("Start destination " + resourceId + " cannot use the same id as the graph " + this);
    }

    /* renamed from: e */
    public final C3824aw mo8087e(C3821at atVar) {
        C3824aw e = super.mo8087e(atVar);
        ArrayList arrayList = new ArrayList();
        C3833ba baVar = new C3833ba(this);
        while (baVar.hasNext()) {
            C3824aw e2 = baVar.next().mo8087e(atVar);
            if (e2 != null) {
                arrayList.add(e2);
            }
        }
        return (C3824aw) C69540x.m100854x(C69531o.m100936m(new C3824aw[]{e, (C3824aw) C69540x.m100854x(arrayList)}));
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C3834bb)) {
            List g = C69734n.m101139g(C69734n.m101176b(new C0986p(this.f12374a)));
            C3834bb bbVar = (C3834bb) obj;
            C0986p pVar = new C0986p(bbVar.f12374a);
            while (pVar.hasNext()) {
                g.remove((C3825ax) pVar.next());
            }
            if (!super.equals(obj) || this.f12374a.mo3725d() != bbVar.f12374a.mo3725d() || this.f12375b != bbVar.f12375b || !g.isEmpty()) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final C3825ax mo8094h(int i, boolean z) {
        C3834bb bbVar;
        C3825ax axVar = (C3825ax) this.f12374a.mo3726e(i);
        if (axVar == null) {
            axVar = null;
            if (z && (bbVar = this.f12355d) != null) {
                return bbVar.mo8094h(i, true);
            }
        }
        return axVar;
    }

    public final int hashCode() {
        int i = this.f12375b;
        C0985o oVar = this.f12374a;
        int d = oVar.mo3725d();
        for (int i2 = 0; i2 < d; i2++) {
            i = (((i * 31) + oVar.mo3723c(i2)) * 31) + ((C3825ax) oVar.mo3727f(i2)).hashCode();
        }
        return i;
    }

    /* renamed from: i */
    public final void mo8095i(C3825ax axVar) {
        C69664n.m101061g(axVar, "node");
        int i = axVar.f12360i;
        String str = axVar.f12361j;
        if (i == 0) {
            if (str != null) {
                i = 0;
            } else {
                throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
            }
        }
        String str2 = this.f12361j;
        if (str2 != null && C69664n.m101066l(str, str2)) {
            throw new IllegalArgumentException("Destination " + axVar + " cannot have the same route as graph " + this);
        } else if (i != this.f12360i) {
            C3825ax axVar2 = (C3825ax) this.f12374a.mo3726e(i);
            if (axVar2 == axVar) {
                return;
            }
            if (axVar.f12355d == null) {
                if (axVar2 != null) {
                    axVar2.f12355d = null;
                }
                axVar.f12355d = this;
                this.f12374a.mo3730i(axVar.f12360i, axVar);
                return;
            }
            throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
        } else {
            throw new IllegalArgumentException("Destination " + axVar + " cannot have the same id as graph " + this);
        }
    }

    public final Iterator iterator() {
        return new C3833ba(this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        C3825ax h = mo8094h(this.f12375b, true);
        sb.append(" startDestination=");
        if (h == null) {
            String str = this.f12376l;
            if (str != null) {
                sb.append(str);
            } else {
                sb.append(C69664n.m101057c("0x", Integer.toHexString(this.f12375b)));
            }
        } else {
            sb.append("{");
            sb.append(h.toString());
            sb.append("}");
        }
        return sb.toString();
    }
}
