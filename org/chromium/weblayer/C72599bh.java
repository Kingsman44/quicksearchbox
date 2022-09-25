package org.chromium.weblayer;

import android.net.Uri;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.apps.tiktok.tracing.contrib.p3714j.C47739p;
import org.chromium.p5643b.p5644a.C72317am;
import org.chromium.p5643b.p5644a.C72328ax;
import org.chromium.p5643b.p5644a.C72341bj;
import org.chromium.p5643b.p5644a.C72343bl;

/* renamed from: org.chromium.weblayer.bh */
/* compiled from: PG */
final class C72599bh extends C72328ax {

    /* renamed from: a */
    final /* synthetic */ C72601bj f193140a;

    public C72599bh(C72601bj bjVar) {
        this.f193140a = bjVar;
    }

    /* renamed from: a */
    public final void mo63755a() {
        C72343bl.m106991a();
        C72580ap apVar = new C72580ap(this.f193140a.f193147e);
        while (apVar.hasNext()) {
            ((C72602bk) apVar.next()).mo47151a();
        }
    }

    /* renamed from: b */
    public final void mo63756b(int i, int i2) {
        C72343bl.m106991a();
        C72601bj e = C72601bj.m107381e(i);
        C72579ao aoVar = this.f193140a.f193150h;
        if (C47831fm.m85027v()) {
            ((C47739p) aoVar).f123708a.mo47096a(e, i2);
            return;
        }
        C47538ax c = ((C47739p) aoVar).f123709b.f123710a.mo51613c("onNewTab");
        try {
            ((C47739p) aoVar).f123708a.mo47096a(e, i2);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }

    /* renamed from: c */
    public final void mo63757c() {
        C72343bl.m106991a();
        C72580ap apVar = new C72580ap(this.f193140a.f193147e);
        while (apVar.hasNext()) {
            ((C72602bk) apVar.next()).mo47188c();
        }
    }

    /* renamed from: d */
    public final void mo63758d(int i, float f) {
        C72343bl.m106991a();
        C72580ap apVar = new C72580ap(this.f193140a.f193147e);
        while (apVar.hasNext()) {
            ((C72602bk) apVar.next()).mo47132b(i, f);
        }
    }

    /* renamed from: e */
    public final void mo63759e() {
        C72601bj.f193143a.remove(Integer.valueOf(this.f193140a.f193152j));
        C72601bj bjVar = this.f193140a;
        bjVar.f193153k = null;
        bjVar.f193144b = new RuntimeException("onTabDestroyed");
    }

    /* renamed from: f */
    public final void mo63760f(C72317am amVar) {
        C72343bl.m106991a();
        String str = (String) C72341bj.m106988a(amVar, String.class);
        C72580ap apVar = new C72580ap(this.f193140a.f193147e);
        while (apVar.hasNext()) {
            ((C72602bk) apVar.next()).mo47189d(str);
        }
    }

    /* renamed from: g */
    public final void mo63761g(int i) {
        C72343bl.m106991a();
        C72580ap apVar = new C72580ap(this.f193140a.f193151i);
        while (apVar.hasNext()) {
            ((C72592ba) apVar.next()).mo47202a(i);
        }
    }

    /* renamed from: h */
    public final void mo63762h(C72317am amVar, C72317am amVar2, C72317am amVar3, C72317am amVar4, C72317am amVar5) {
        mo63768n(amVar, amVar2, amVar3, amVar4, amVar5);
    }

    /* renamed from: i */
    public final void mo63763i(String str) {
        C72343bl.m106991a();
        Uri parse = Uri.parse(str);
        C72580ap apVar = new C72580ap(this.f193140a.f193147e);
        while (apVar.hasNext()) {
            ((C72602bk) apVar.next()).mo47190e(parse);
        }
    }

    /* renamed from: j */
    public final void mo63764j(C72317am amVar) {
        C72343bl.m106991a();
        String str = (String) C72341bj.m106988a(amVar, String.class);
    }

    /* renamed from: k */
    public final void mo63765k() {
        C72343bl.m106991a();
        C72580ap apVar = new C72580ap(this.f193140a.f193147e);
        while (apVar.hasNext()) {
            C72602bk bkVar = (C72602bk) apVar.next();
        }
    }

    /* renamed from: l */
    public final void mo63766l() {
        C72343bl.m106991a();
        C72580ap apVar = new C72580ap(this.f193140a.f193147e);
        while (apVar.hasNext()) {
            C72602bk bkVar = (C72602bk) apVar.next();
        }
    }

    /* renamed from: m */
    public final void mo63767m() {
        C72343bl.m106991a();
        C72580ap apVar = new C72580ap(this.f193140a.f193147e);
        while (apVar.hasNext()) {
            C72602bk bkVar = (C72602bk) apVar.next();
        }
    }

    /* renamed from: n */
    public final void mo63768n(C72317am amVar, C72317am amVar2, C72317am amVar3, C72317am amVar4, C72317am amVar5) {
        C72343bl.m106991a();
        String str = (String) C72341bj.m106988a(amVar2, String.class);
        String str2 = (String) C72341bj.m106988a(amVar5, String.class);
        Uri parse = Uri.parse((String) C72341bj.m106988a(amVar, String.class));
        Uri uri = null;
        Uri parse2 = str != null ? Uri.parse(str) : null;
        String str3 = (String) C72341bj.m106988a(amVar3, String.class);
        String str4 = (String) C72341bj.m106988a(amVar4, String.class);
        if (str2 != null) {
            uri = Uri.parse(str2);
        }
        C72624m mVar = new C72624m(parse, parse2, str3, str4, uri);
        C72580ap apVar = new C72580ap(this.f193140a.f193147e);
        while (apVar.hasNext()) {
            ((C72602bk) apVar.next()).mo47191f(mVar);
        }
    }
}
