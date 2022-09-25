package com.google.android.libraries.search.rendering.xuikit.p3097a.p3098a.p3102b.p3106b.p3107a;

import android.content.Context;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.litho.C6128bi;
import com.facebook.litho.C6278fu;
import com.facebook.litho.C6279fv;
import com.facebook.litho.C6281fx;
import com.facebook.litho.C6407q;
import com.facebook.litho.C6411u;
import com.facebook.litho.p323b.C6117a;
import com.facebook.litho.p323b.C6118b;
import com.facebook.litho.p323b.C6119c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30304m;
import com.google.android.libraries.onegoogle.accountmenu.p2353c.C30343m;
import com.google.android.libraries.search.rendering.xuikit.p3097a.p3098a.p3102b.p3106b.p3107a.p3108a.C39944b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4396b.p4400c.p4401a.C57722f;
import java.util.concurrent.atomic.AtomicInteger;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.a.a.b.b.a.c */
/* compiled from: PG */
public final class C39947c extends C6407q {
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: a */
    Fragment f105000a;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: b */
    C39950f f105001b;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: c */
    C57722f f105002c;

    public C39947c() {
        super("Mavatar");
    }

    /* renamed from: b */
    protected static void m69373b(C6411u uVar) {
        if (uVar.f19012e != null) {
            uVar.mo13349g(new C6278fu(0, new Object[0]), "updateState:Mavatar.forceComponentRemount");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final int mo12793K() {
        return 3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public final Object mo12797P(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(LayoutInflater.from(context).inflate(R.layout.selected_account_disc_open_search_bar, (ViewGroup) null));
        return frameLayout;
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public final void mo12799R(C6411u uVar) {
        C6281fx fxVar = new C6281fx();
        fxVar.f18496a = new AtomicInteger(0);
        ((C39946b) this.f18999v).f104999a = (AtomicInteger) fxVar.f18496a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public final void mo12805Y(C6411u uVar, Object obj) {
        FrameLayout frameLayout = (FrameLayout) obj;
        C57722f fVar = this.f105002c;
        Fragment fragment = this.f105000a;
        C39950f fVar2 = this.f105001b;
        AtomicInteger atomicInteger = ((C39946b) this.f18999v).f104999a;
        if (fVar2 != null) {
            fVar2.f105016h = new C39963q(uVar);
            if (!fVar.equals(fVar2.f105014f)) {
                fVar2.f105014f = fVar;
                C39959o a = fVar2.f105013e.mo17754z();
                C58485gu a2 = C39959o.m69402a(a.f105053l);
                C58485gu a3 = C39959o.m69402a(fVar);
                boolean i = C58597ky.m90218i(a3, a2);
                a.f105053l = fVar;
                if (!i) {
                    a.f105046e.mo50707a(new C39944b(a.f105050i, a3), a.f105051j);
                } else {
                    C30304m g = fVar2.f105015g.mo35856g(fVar2.f105012d.f19009b);
                    g.mo35845s(fVar2.mo42091a());
                    fVar2.f105015g = g.mo35830d();
                }
            }
            C30343m.m56502b(fragment, fVar2.f105015g, (SelectedAccountDisc) frameLayout.findViewById(R.id.selected_account_disc));
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo13057a(Object obj) {
        return mo13057a((C6407q) obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: aa */
    public final void mo12810aa(C6411u uVar, Object obj) {
        FrameLayout frameLayout = (FrameLayout) obj;
        this.f105001b.f105016h = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ac */
    public final void mo12812ac(C6279fv fvVar, C6279fv fvVar2) {
        ((C39946b) fvVar2).f104999a = ((C39946b) fvVar).f104999a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ai */
    public final boolean mo12818ai() {
        return true;
    }

    /* renamed from: am */
    public final boolean mo12822am() {
        return true;
    }

    /* renamed from: ao */
    public final int mo12824ao() {
        return 3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: as */
    public final boolean mo12828as(C6407q qVar, C6407q qVar2) {
        AtomicInteger atomicInteger;
        C39947c cVar = (C39947c) qVar;
        C39947c cVar2 = (C39947c) qVar2;
        C57722f fVar = null;
        if (cVar == null) {
            atomicInteger = null;
        } else {
            atomicInteger = ((C39946b) cVar.f18999v).f104999a;
        }
        C6128bi biVar = new C6128bi(atomicInteger, ((C39946b) cVar2.f18999v).f104999a);
        if (cVar != null) {
            fVar = cVar.f105002c;
        }
        C6128bi biVar2 = new C6128bi(fVar, cVar2.f105002c);
        return (Objects.equals(biVar.f18143a, biVar.f18144b) ^ true) || (Objects.equals(biVar2.f18143a, biVar2.f18144b) ^ true);
    }

    /* renamed from: f */
    public final boolean mo13115f(C6407q qVar) {
        if (this == qVar) {
            return true;
        }
        if (qVar == null || getClass() != qVar.getClass()) {
            return false;
        }
        C39947c cVar = (C39947c) qVar;
        Fragment fragment = this.f105000a;
        if (fragment == null ? cVar.f105000a != null : !fragment.equals(cVar.f105000a)) {
            return false;
        }
        C39950f fVar = this.f105001b;
        if (fVar == null ? cVar.f105001b != null : !fVar.equals(cVar.f105001b)) {
            return false;
        }
        C57722f fVar2 = this.f105002c;
        return fVar2 == null ? cVar.f105002c == null : fVar2.equals(cVar.f105002c);
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ C6407q mo13318j() {
        C39947c cVar = (C39947c) super.mo13318j();
        cVar.f18999v = new C39946b();
        return cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final /* synthetic */ C6279fv mo13319o() {
        return new C39946b();
    }
}
