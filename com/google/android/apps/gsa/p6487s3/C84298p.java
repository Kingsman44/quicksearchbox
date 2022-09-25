package com.google.android.apps.gsa.p6487s3;

import android.os.Process;
import com.google.android.apps.gsa.p6487s3.p6488a.C84282c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p6968aa.C89012aj;
import com.google.android.apps.gsa.shared.p6968aa.C89040bk;
import com.google.android.apps.gsa.shared.p6968aa.C89061q;
import com.google.android.apps.gsa.shared.p6968aa.C89068x;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.speech.p7139a.C90523o;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.speech.p7295k.p7296a.C92439c;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60870cx;
import com.google.p395al.p408c.p414c.p416b.C8466ai;
import java.net.MalformedURLException;

/* renamed from: com.google.android.apps.gsa.s3.p */
/* compiled from: PG */
final class C84298p extends C84328q {

    /* renamed from: a */
    public final C84330s f229401a;

    /* renamed from: b */
    protected final C84295m f229402b;

    /* renamed from: c */
    protected final C92439c f229403c;

    /* renamed from: d */
    final /* synthetic */ C84330s f229404d;

    /* renamed from: f */
    private final C8466ai f229405f;

    /* renamed from: g */
    private final String f229406g;

    /* renamed from: h */
    private final C89012aj f229407h;

    /* renamed from: i */
    private final C89061q f229408i;

    /* renamed from: j */
    private final boolean f229409j;

    /* renamed from: k */
    private final C86124t f229410k;

    /* renamed from: l */
    private C60870cx f229411l = null;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84298p(C84330s sVar, C84330s sVar2, C8466ai aiVar, String str, C89012aj ajVar, C89061q qVar, C92439c cVar, boolean z, C84295m mVar, C86124t tVar) {
        super("PairHttpUp");
        this.f229404d = sVar;
        this.f229401a = sVar2;
        aiVar.getClass();
        this.f229405f = aiVar;
        str.getClass();
        this.f229406g = str;
        ajVar.getClass();
        this.f229407h = ajVar;
        qVar.getClass();
        this.f229408i = qVar;
        this.f229403c = cVar;
        this.f229409j = z;
        this.f229402b = mVar;
        this.f229410k = tVar;
    }

    /* renamed from: f */
    private final C60870cx m134468f(C89068x xVar) {
        try {
            return this.f229407h.mo27496g(m134531e(this.f229405f, this.f229406g, this.f229404d.f229508b, 37, this.f229409j), xVar, this.f229408i);
        } catch (MalformedURLException e) {
            ((C59052c) ((C59052c) C84330s.f229507a.mo56226d()).mo56372aa(7180)).mo56354G("Malformed URL '%s' with suffix '%s'", this.f229405f.f29398b, this.f229406g);
            int i = C90755l.f253831a;
            throw new C90523o((Throwable) e, 65538);
        }
    }

    /* renamed from: a */
    public final void mo77834a() {
        super.mo77834a();
        C60870cx cxVar = this.f229411l;
        if (cxVar != null) {
            cxVar.cancel(true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77835b() {
        if (this.f229495e) {
            throw new InterruptedException();
        }
    }

    /* renamed from: c */
    public final void mo77836c() {
        int i = 0;
        try {
            if (this.f229410k.mo79746e(C90086ek.f250513k)) {
                i = Process.getThreadPriority(Process.myTid());
                Process.setThreadPriority(-19);
            }
            mo77835b();
            C89949q.m146523g(7);
            C89040bk bkVar = new C89040bk(this.f229407h.mo27509a());
            C84282c cVar = new C84282c(bkVar, this.f229405f.f29402f);
            this.f229411l = m134468f(bkVar);
            C89949q.m146523g(8);
            ((C59052c) ((C59052c) C84330s.f229507a.mo56224b()).mo56372aa(7188)).mo56386p("[Upload] Connected");
            mo77835b();
            this.f229403c.mo87118a().mo20440jJ(new C84297o(this, this.f229411l, cVar));
            if (this.f229410k.mo79746e(C90086ek.f250513k)) {
                Process.setThreadPriority(i);
            }
        } catch (C90523o e) {
            this.f229402b.mo77831a(e);
            if (this.f229410k.mo79746e(C90086ek.f250513k)) {
                Process.setThreadPriority(0);
            }
        } catch (Throwable th) {
            if (this.f229410k.mo79746e(C90086ek.f250513k)) {
                Process.setThreadPriority(0);
            }
            throw th;
        }
    }
}
