package com.google.android.libraries.web.shared.lifecycle;

import android.support.p031v4.app.Fragment;
import androidx.lifecycle.C2368bp;
import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2391v;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.web.coordinator.internal.fragment.C43749h;
import com.google.android.libraries.web.shared.lifecycle.internal.HiltWebModelHolderViewModel;
import p5462h.C69613f;
import p5462h.C69747m;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class WebModelProvider {

    /* renamed from: a */
    public final C69613f f114787a;

    public WebModelProvider(Fragment fragment) {
        C69664n.m101061g(fragment, "fragment");
        this.f114787a = new C69747m(new C44108i(new C2368bp(fragment), fragment, C43749h.m77260a(fragment)));
        if (C19559g.m37305d(Thread.currentThread())) {
            fragment.getLifecycle().mo5790b(new C2376g() {
                /* renamed from: gV */
                public final void mo3520gV(C2391v vVar) {
                    WebModelProvider.this.f114787a.mo5768a();
                }

                /* renamed from: gW */
                public final /* synthetic */ void mo3521gW(C2391v vVar) {
                }

                /* renamed from: gX */
                public final /* synthetic */ void mo3522gX(C2391v vVar) {
                }

                /* renamed from: gY */
                public final /* synthetic */ void mo3523gY(C2391v vVar) {
                }

                /* renamed from: gZ */
                public final /* synthetic */ void mo3524gZ(C2391v vVar) {
                }

                /* renamed from: ha */
                public final /* synthetic */ void mo3525ha(C2391v vVar) {
                }
            });
        }
    }

    /* renamed from: a */
    public final C44107h mo47072a(Class cls) {
        C44107h a = ((HiltWebModelHolderViewModel) this.f114787a.mo5768a()).mo47077a(cls, "com.google.android.libraries.web.WebModelDefaultKey");
        C69664n.m101058d(a);
        return a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0018, code lost:
        r3 = r5.mo5761a(r3);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo47073b(java.lang.Class r3, java.lang.Object r4, p5462h.p5473f.p5474a.C69626l r5) {
        /*
            r2 = this;
            java.lang.String r0 = "defaultState"
            p5462h.p5473f.p5475b.C69664n.m101061g(r4, r0)
            h.f r1 = r2.f114787a
            java.lang.Object r1 = r1.mo5768a()
            com.google.android.libraries.web.shared.lifecycle.internal.HiltWebModelHolderViewModel r1 = (com.google.android.libraries.web.shared.lifecycle.internal.HiltWebModelHolderViewModel) r1
            p5462h.p5473f.p5475b.C69664n.m101061g(r4, r0)
            java.lang.String r0 = "com.google.android.libraries.web.WebModelDefaultKey"
            com.google.android.libraries.web.shared.lifecycle.h r3 = r1.mo47077a(r3, r0)
            if (r3 == 0) goto L_0x0020
            java.lang.Object r3 = r5.mo5761a(r3)
            if (r3 != 0) goto L_0x001f
            return r4
        L_0x001f:
            r4 = r3
        L_0x0020:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.web.shared.lifecycle.WebModelProvider.mo47073b(java.lang.Class, java.lang.Object, h.f.a.l):java.lang.Object");
    }

    public WebModelProvider(HiltWebModelHolderViewModel hiltWebModelHolderViewModel) {
        this.f114787a = new C69747m(new C44110j(hiltWebModelHolderViewModel));
    }
}
