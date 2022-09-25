package androidx.navigation.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.p031v4.app.FragmentManager;
import android.util.Log;
import androidx.core.p094f.C1891d;
import androidx.navigation.C3825ax;
import androidx.navigation.C3865cf;
import androidx.navigation.C3868ci;
import androidx.navigation.C3892m;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p5462h.C69685i;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

@C3865cf(mo8118a = "fragment")
/* renamed from: androidx.navigation.fragment.f */
/* compiled from: PG */
public final class C3882f extends C3868ci {

    /* renamed from: b */
    private final Context f12457b;

    /* renamed from: c */
    private final FragmentManager f12458c;

    /* renamed from: d */
    private final int f12459d;

    /* renamed from: e */
    private final Set f12460e = new LinkedHashSet();

    public C3882f(Context context, FragmentManager fragmentManager, int i) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(fragmentManager, "fragmentManager");
        this.f12457b = context;
        this.f12458c = fragmentManager;
        this.f12459d = i;
    }

    /* renamed from: a */
    public final /* synthetic */ C3825ax mo8074a() {
        return new C3880d(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0123 A[SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8097d(java.util.List r13, androidx.navigation.C3840bh r14, androidx.navigation.C3864ce r15) {
        /*
            r12 = this;
            java.lang.String r0 = "entries"
            p5462h.p5473f.p5475b.C69664n.m101061g(r13, r0)
            android.support.v4.app.FragmentManager r0 = r12.f12458c
            boolean r0 = r0.mo461ab()
            if (r0 == 0) goto L_0x0015
            java.lang.String r13 = "FragmentNavigator"
            java.lang.String r14 = "Ignoring navigate() call: FragmentManager has already saved its state"
            android.util.Log.i(r13, r14)
            return
        L_0x0015:
            java.util.Iterator r13 = r13.iterator()
        L_0x0019:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x012e
            java.lang.Object r0 = r13.next()
            androidx.navigation.m r0 = (androidx.navigation.C3892m) r0
            androidx.navigation.cl r1 = r12.mo8120f()
            kotlinx.coroutines.b.du r1 = r1.f12436f
            java.lang.Object r1 = r1.mo62784e()
            java.util.List r1 = (java.util.List) r1
            boolean r2 = r1.isEmpty()
            if (r14 == 0) goto L_0x0056
            if (r2 != 0) goto L_0x0056
            boolean r3 = r14.f12391b
            if (r3 == 0) goto L_0x0056
            java.util.Set r3 = r12.f12460e
            java.lang.String r4 = r0.f12480e
            boolean r3 = r3.remove(r4)
            if (r3 == 0) goto L_0x0056
            android.support.v4.app.FragmentManager r1 = r12.f12458c
            java.lang.String r2 = r0.f12480e
            r1.mo445L(r2)
            androidx.navigation.cl r1 = r12.mo8120f()
            r1.mo8127e(r0)
            goto L_0x0019
        L_0x0056:
            androidx.navigation.ax r3 = r0.f12477b
            androidx.navigation.fragment.d r3 = (androidx.navigation.fragment.C3880d) r3
            android.os.Bundle r4 = r0.f12478c
            java.lang.String r5 = r3.f12456a
            if (r5 == 0) goto L_0x0126
            r6 = 0
            char r7 = r5.charAt(r6)
            r8 = 46
            if (r7 != r8) goto L_0x0073
            android.content.Context r7 = r12.f12457b
            java.lang.String r7 = r7.getPackageName()
            java.lang.String r5 = p5462h.p5473f.p5475b.C69664n.m101057c(r7, r5)
        L_0x0073:
            android.support.v4.app.FragmentManager r7 = r12.f12458c
            android.support.v4.app.as r7 = r7.mo475h()
            android.content.Context r8 = r12.f12457b
            java.lang.ClassLoader r8 = r8.getClassLoader()
            android.support.v4.app.Fragment r5 = r7.mo586a(r8, r5)
            java.lang.String r7 = "fragmentManager.fragment…t.classLoader, className)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r7)
            r5.setArguments(r4)
            android.support.v4.app.FragmentManager r4 = r12.f12458c
            android.support.v4.app.a r7 = new android.support.v4.app.a
            r7.<init>((android.support.p031v4.app.FragmentManager) r4)
            r4 = -1
            if (r14 != 0) goto L_0x0097
            r8 = -1
            goto L_0x0099
        L_0x0097:
            int r8 = r14.f12395f
        L_0x0099:
            if (r14 != 0) goto L_0x009d
            r9 = -1
            goto L_0x009f
        L_0x009d:
            int r9 = r14.f12396g
        L_0x009f:
            if (r14 != 0) goto L_0x00a3
            r10 = -1
            goto L_0x00a5
        L_0x00a3:
            int r10 = r14.f12397h
        L_0x00a5:
            if (r14 != 0) goto L_0x00a9
            r11 = -1
            goto L_0x00ab
        L_0x00a9:
            int r11 = r14.f12398i
        L_0x00ab:
            if (r8 != r4) goto L_0x00bb
            if (r9 != r4) goto L_0x00ba
            if (r10 != r4) goto L_0x00b7
            if (r11 == r4) goto L_0x00cc
            r8 = -1
            r9 = -1
            r10 = -1
            goto L_0x00bb
        L_0x00b7:
            r8 = -1
            r9 = -1
            goto L_0x00bb
        L_0x00ba:
            r8 = -1
        L_0x00bb:
            if (r8 == r4) goto L_0x00be
            goto L_0x00bf
        L_0x00be:
            r8 = 0
        L_0x00bf:
            if (r9 == r4) goto L_0x00c2
            goto L_0x00c3
        L_0x00c2:
            r9 = 0
        L_0x00c3:
            if (r10 != r4) goto L_0x00c6
            r10 = 0
        L_0x00c6:
            if (r11 != r4) goto L_0x00c9
            r11 = 0
        L_0x00c9:
            r7.mo691x(r8, r9, r10, r11)
        L_0x00cc:
            int r4 = r12.f12459d
            r8 = 0
            r7.mo689v(r4, r5, r8)
            r7.mo518o(r5)
            int r3 = r3.f12360i
            r4 = 1
            if (r14 == 0) goto L_0x00ee
            if (r2 != 0) goto L_0x00ee
            boolean r5 = r14.f12390a
            if (r5 == 0) goto L_0x00ee
            java.lang.Object r5 = p5462h.p5463a.C69540x.m100823E(r1)
            androidx.navigation.m r5 = (androidx.navigation.C3892m) r5
            androidx.navigation.ax r5 = r5.f12477b
            int r5 = r5.f12360i
            if (r5 != r3) goto L_0x00ee
            r3 = 1
            goto L_0x00ef
        L_0x00ee:
            r3 = 0
        L_0x00ef:
            if (r2 == 0) goto L_0x00f3
        L_0x00f1:
            r1 = 1
            goto L_0x010f
        L_0x00f3:
            if (r3 == 0) goto L_0x0109
            int r1 = r1.size()
            if (r1 <= r4) goto L_0x0107
            android.support.v4.app.FragmentManager r1 = r12.f12458c
            java.lang.String r2 = r0.f12480e
            r1.mo468ak(r2)
            java.lang.String r1 = r0.f12480e
            r7.mo686s(r1)
        L_0x0107:
            r1 = 0
            goto L_0x010f
        L_0x0109:
            java.lang.String r1 = r0.f12480e
            r7.mo686s(r1)
            goto L_0x00f1
        L_0x010f:
            boolean r2 = r15 instanceof androidx.navigation.fragment.C3881e
            if (r2 != 0) goto L_0x0123
            r7.f824t = r4
            r7.mo505b(r6)
            if (r1 == 0) goto L_0x0019
            androidx.navigation.cl r1 = r12.mo8120f()
            r1.mo8127e(r0)
            goto L_0x0019
        L_0x0123:
            androidx.navigation.fragment.e r15 = (androidx.navigation.fragment.C3881e) r15
            throw r8
        L_0x0126:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "Fragment class was not set"
            r13.<init>(r14)
            throw r13
        L_0x012e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.fragment.C3882f.mo8097d(java.util.List, androidx.navigation.bh, androidx.navigation.ce):void");
    }

    /* renamed from: e */
    public final Bundle mo8119e() {
        if (this.f12460e.isEmpty()) {
            return null;
        }
        return C1891d.m5154a(new C69685i("androidx-nav-fragment:navigator:savedIds", new ArrayList(this.f12460e)));
    }

    /* renamed from: h */
    public final void mo8122h(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("androidx-nav-fragment:navigator:savedIds");
        if (stringArrayList != null) {
            this.f12460e.clear();
            C69540x.m100811r(this.f12460e, stringArrayList);
        }
    }

    /* renamed from: i */
    public final void mo8123i(C3892m mVar, boolean z) {
        C69664n.m101061g(mVar, "popUpTo");
        if (this.f12458c.mo461ab()) {
            Log.i("FragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        if (z) {
            List list = (List) mo8120f().f12436f.mo62784e();
            C3892m mVar2 = (C3892m) C69540x.m100819A(list);
            for (C3892m mVar3 : C69540x.m100834P(list.subList(list.indexOf(mVar), list.size()))) {
                if (C69664n.m101066l(mVar3, mVar2)) {
                    Log.i("FragmentNavigator", C69664n.m101057c("FragmentManager cannot save the state of the initial destination ", mVar3));
                } else {
                    this.f12458c.mo447N(mVar3.f12480e);
                    this.f12460e.add(mVar3.f12480e);
                }
            }
        } else {
            this.f12458c.mo468ak(mVar.f12480e);
        }
        mo8120f().mo8126d(mVar, z);
    }
}
