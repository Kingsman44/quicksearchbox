package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.C1815be;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p5462h.p5463a.C69530n;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.navigation.as */
/* compiled from: PG */
public final class C3820as {

    /* renamed from: a */
    public final Context f12339a;

    /* renamed from: b */
    public final Intent f12340b;

    /* renamed from: c */
    public C3834bb f12341c;

    /* renamed from: d */
    public final List f12342d;

    public C3820as(Context context) {
        Intent intent;
        C69664n.m101061g(context, "context");
        this.f12339a = context;
        if (context instanceof Activity) {
            intent = new Intent(context, context.getClass());
        } else {
            intent = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (intent == null) {
                intent = new Intent();
            }
        }
        intent.addFlags(268468224);
        this.f12340b = intent;
        this.f12342d = new ArrayList();
    }

    /* renamed from: e */
    private final C3825ax m11037e(int i) {
        C69530n nVar = new C69530n();
        C3834bb bbVar = this.f12341c;
        C69664n.m101058d(bbVar);
        nVar.mo61321j(bbVar);
        while (!nVar.isEmpty()) {
            C3825ax axVar = (C3825ax) nVar.mo61315g();
            if (axVar.f12360i == i) {
                return axVar;
            }
            if (axVar instanceof C3834bb) {
                C3833ba baVar = new C3833ba((C3834bb) axVar);
                while (baVar.hasNext()) {
                    nVar.mo61321j(baVar.next());
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public final C1815be mo8078a() {
        if (this.f12341c == null) {
            throw new IllegalStateException("You must call setGraph() before constructing the deep link");
        } else if (!this.f12342d.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = this.f12342d.iterator();
            C3825ax axVar = null;
            while (true) {
                int i = 0;
                if (it.hasNext()) {
                    C3817ap apVar = (C3817ap) it.next();
                    int i2 = apVar.f12336a;
                    Bundle bundle = apVar.f12337b;
                    C3825ax e = m11037e(i2);
                    if (e != null) {
                        int[] g = e.mo8089g(axVar);
                        int length = g.length;
                        while (i < length) {
                            arrayList.add(Integer.valueOf(g[i]));
                            arrayList2.add(bundle);
                            i++;
                        }
                        axVar = e;
                    } else {
                        int i3 = C3825ax.f12352k;
                        String b = C3823av.m11044b(this.f12339a, i2);
                        throw new IllegalArgumentException("Navigation destination " + b + " cannot be found in the navigation graph " + this.f12341c);
                    }
                } else {
                    this.f12340b.putExtra("android-support-nav:controller:deepLinkIds", C69540x.m100849ae(arrayList));
                    this.f12340b.putParcelableArrayListExtra("android-support-nav:controller:deepLinkArgs", arrayList2);
                    C1815be beVar = new C1815be(this.f12339a);
                    beVar.mo5004a(new Intent(this.f12340b));
                    int size = beVar.f5643a.size();
                    while (i < size) {
                        int i4 = i + 1;
                        Intent intent = (Intent) beVar.f5643a.get(i);
                        if (intent != null) {
                            intent.putExtra("android-support-nav:controller:deepLinkIntent", this.f12340b);
                        }
                        i = i4;
                    }
                    return beVar;
                }
            }
        } else {
            throw new IllegalStateException("You must call setDestination() or addDestination() before constructing the deep link");
        }
    }

    /* renamed from: b */
    public final void mo8079b() {
        for (C3817ap apVar : this.f12342d) {
            int i = apVar.f12336a;
            if (m11037e(i) == null) {
                int i2 = C3825ax.f12352k;
                String b = C3823av.m11044b(this.f12339a, i);
                throw new IllegalArgumentException("Navigation destination " + b + " cannot be found in the navigation graph " + this.f12341c);
            }
        }
    }

    /* renamed from: c */
    public final void mo8080c(int i, Bundle bundle) {
        this.f12342d.add(new C3817ap(i, bundle));
        if (this.f12341c != null) {
            mo8079b();
        }
    }

    /* renamed from: d */
    public final void mo8081d(Bundle bundle) {
        this.f12340b.putExtra("android-support-nav:controller:deepLinkExtras", bundle);
    }

    public C3820as(C3807af afVar) {
        this(afVar.f12287a);
        this.f12341c = afVar.mo8047g();
    }
}
