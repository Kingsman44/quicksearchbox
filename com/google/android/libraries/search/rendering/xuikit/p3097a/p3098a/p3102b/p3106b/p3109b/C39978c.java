package com.google.android.libraries.search.rendering.xuikit.p3097a.p3098a.p3102b.p3106b.p3109b;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.facebook.litho.C6128bi;
import com.facebook.litho.C6276fs;
import com.facebook.litho.C6279fv;
import com.facebook.litho.C6281fx;
import com.facebook.litho.C6407q;
import com.facebook.litho.C6411u;
import com.facebook.litho.C6564z;
import com.facebook.litho.p323b.C6117a;
import com.facebook.litho.p323b.C6118b;
import com.facebook.litho.p323b.C6119c;
import com.facebook.litho.p333i.C6396a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.elements.interfaces.C21313t;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3133b.C40327r;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3137f.C40364q;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3137f.C40365r;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3137f.C40367t;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3143l.C40480q;
import com.google.android.libraries.search.video.conductor.C41478a;
import com.google.android.libraries.search.video.players.C41592w;
import com.google.android.libraries.search.video.players.C41593x;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.frameworks.client.p4624a.p4625a.C61301b;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.C57128al;
import com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4396b.p4400c.p4402b.C57736l;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Objects;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.a.a.b.b.b.c */
/* compiled from: PG */
public final class C39978c extends C6407q {
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: A */
    C40327r f105088A;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: B */
    C41593x f105089B;
    @C6117a(mo12871a = 0)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: a */
    float f105090a;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: b */
    C21313t f105091b;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: c */
    C41478a f105092c;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: d */
    C21319z f105093d;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: e */
    String f105094e;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: f */
    C40480q f105095f;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: g */
    C57736l f105096g;

    public C39978c() {
        super("Video");
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
        frameLayout.setId(R.id.video_root);
        return frameLayout;
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public final void mo12799R(C6411u uVar) {
        C6281fx fxVar = new C6281fx();
        fxVar.f18496a = new AtomicReference();
        ((C39977b) this.f18999v).f105087a = (AtomicReference) fxVar.f18496a;
    }

    /* renamed from: X */
    public final void mo12804X(C6411u uVar, C6564z zVar, int i, int i2, C6276fs fsVar) {
        C6396a.m17150b(i, i2, this.f105090a, fsVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public final void mo12805Y(C6411u uVar, Object obj) {
        FrameLayout frameLayout = (FrameLayout) obj;
        String str = this.f105094e;
        C41478a aVar = this.f105092c;
        C57736l lVar = this.f105096g;
        C40480q qVar = this.f105095f;
        C41593x xVar = this.f105089B;
        C21313t tVar = this.f105091b;
        C21319z zVar = this.f105093d;
        C40327r rVar = this.f105088A;
        AtomicReference atomicReference = ((C39977b) this.f18999v).f105087a;
        C57128al alVar = lVar.f154249b;
        if (alVar == null) {
            alVar = C57128al.f152495c;
        }
        C41592w c = xVar.mo44077c(frameLayout, alVar);
        atomicReference.set(c);
        if (c != null) {
            qVar.mo42465b(new C39981f(c, aVar, frameLayout), "VideoSpec::onMount", new String[0]);
            if (!TextUtils.isEmpty(str)) {
                C69664n.m101061g(str, "key");
                if (rVar.f105932c.putIfAbsent(str, c) != null) {
                    C59052c cVar = (C59052c) C40327r.f105930a.mo56225c();
                    cVar.mo56378ag(C40364q.f106014a, C40365r.m70032a(rVar.f105931b.mo42422a(), zVar));
                    String simpleName = c.getClass().getSimpleName();
                    C69664n.m101060f(simpleName, "obj::class.java.simpleName");
                    C61301b a = C40367t.m70035a(simpleName);
                    C61301b b = C40367t.m70036b(str);
                    cVar.mo56379ah(new C59094n(53326));
                    cVar.mo56354G("An existing %s object has already been tracked with key %s", a, b);
                }
            }
            if ((lVar.f154248a & 2) != 0) {
                CommandOuterClass$Command commandOuterClass$Command = lVar.f154250c;
                if (commandOuterClass$Command == null) {
                    commandOuterClass$Command = CommandOuterClass$Command.f179510a;
                }
                c.mo44085h(new C39982g(tVar, zVar, commandOuterClass$Command));
            }
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo13057a(Object obj) {
        return mo13057a((C6407q) obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: aa */
    public final void mo12810aa(C6411u uVar, Object obj) {
        String str = this.f105094e;
        C41478a aVar = this.f105092c;
        C40480q qVar = this.f105095f;
        C40327r rVar = this.f105088A;
        C21319z zVar = this.f105093d;
        AtomicReference atomicReference = ((C39977b) this.f18999v).f105087a;
        qVar.mo42465b(new C39980e(aVar, (FrameLayout) obj), "VideoSpec::onUnmount", new String[0]);
        C41592w wVar = (C41592w) atomicReference.get();
        if (wVar != null) {
            if (!TextUtils.isEmpty(str)) {
                C69664n.m101061g(str, "key");
                if (!rVar.f105932c.remove(str, wVar)) {
                    C59052c cVar = (C59052c) C40327r.f105930a.mo56225c();
                    cVar.mo56378ag(C40364q.f106014a, C40365r.m70032a(rVar.f105931b.mo42422a(), zVar));
                    String simpleName = wVar.getClass().getSimpleName();
                    C69664n.m101060f(simpleName, "obj::class.java.simpleName");
                    C61301b a = C40367t.m70035a(simpleName);
                    C61301b b = C40367t.m70036b(str);
                    cVar.mo56379ah(new C59094n(53327));
                    cVar.mo56354G("Cannot remove a %s object for key %s because it doesn't match the tracked object", a, b);
                }
            }
            wVar.mo44088k();
        }
        atomicReference.set((Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ac */
    public final void mo12812ac(C6279fv fvVar, C6279fv fvVar2) {
        ((C39977b) fvVar2).f105087a = ((C39977b) fvVar).f105087a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: af */
    public final boolean mo12815af() {
        return true;
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
        C57736l lVar;
        C57128al alVar;
        C57128al alVar2;
        C39978c cVar = (C39978c) qVar;
        C39978c cVar2 = (C39978c) qVar2;
        if (cVar == null) {
            lVar = null;
        } else {
            lVar = cVar.f105096g;
        }
        C6128bi biVar = new C6128bi(lVar, cVar2.f105096g);
        C57736l lVar2 = (C57736l) biVar.f18144b;
        C57736l lVar3 = (C57736l) biVar.f18143a;
        if (lVar2 != null) {
            alVar = lVar2.f154249b;
            if (alVar == null) {
                alVar = C57128al.f152495c;
            }
        } else {
            alVar = C57128al.f152495c;
        }
        if (lVar3 != null) {
            alVar2 = lVar3.f154249b;
            if (alVar2 == null) {
                alVar2 = C57128al.f152495c;
            }
        } else {
            alVar2 = C57128al.f152495c;
        }
        return !Objects.equals(alVar, alVar2);
    }

    /* renamed from: f */
    public final boolean mo13115f(C6407q qVar) {
        if (this == qVar) {
            return true;
        }
        if (qVar == null || getClass() != qVar.getClass()) {
            return false;
        }
        C39978c cVar = (C39978c) qVar;
        if (Float.compare(this.f105090a, cVar.f105090a) != 0) {
            return false;
        }
        C21313t tVar = this.f105091b;
        if (tVar == null ? cVar.f105091b != null : !tVar.equals(cVar.f105091b)) {
            return false;
        }
        C41478a aVar = this.f105092c;
        if (aVar == null ? cVar.f105092c != null : !aVar.equals(cVar.f105092c)) {
            return false;
        }
        C21319z zVar = this.f105093d;
        if (zVar == null ? cVar.f105093d != null : !zVar.equals(cVar.f105093d)) {
            return false;
        }
        String str = this.f105094e;
        if (str == null ? cVar.f105094e != null : !str.equals(cVar.f105094e)) {
            return false;
        }
        C40480q qVar2 = this.f105095f;
        if (qVar2 == null ? cVar.f105095f != null : !qVar2.equals(cVar.f105095f)) {
            return false;
        }
        C57736l lVar = this.f105096g;
        if (lVar == null ? cVar.f105096g != null : !lVar.equals(cVar.f105096g)) {
            return false;
        }
        C40327r rVar = this.f105088A;
        if (rVar == null ? cVar.f105088A != null : !rVar.equals(cVar.f105088A)) {
            return false;
        }
        C41593x xVar = this.f105089B;
        return xVar == null ? cVar.f105089B == null : xVar.equals(cVar.f105089B);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final /* synthetic */ C6279fv mo13319o() {
        return new C39977b();
    }
}
