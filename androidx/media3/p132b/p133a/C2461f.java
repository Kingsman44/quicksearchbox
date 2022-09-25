package androidx.media3.p132b.p133a;

import android.net.Uri;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.p132b.C2490ai;
import androidx.media3.p132b.C2494am;
import androidx.media3.p132b.C2495an;
import androidx.media3.p132b.C2505i;
import androidx.media3.p132b.C2506j;
import androidx.media3.p132b.C2509m;
import androidx.media3.p132b.C2510n;
import java.util.Collections;
import java.util.Map;

/* renamed from: androidx.media3.b.a.f */
/* compiled from: PG */
public final class C2461f implements C2505i {

    /* renamed from: a */
    private final C2457b f6760a;

    /* renamed from: b */
    private final C2505i f6761b;

    /* renamed from: c */
    private final C2505i f6762c;

    /* renamed from: d */
    private final C2505i f6763d;

    /* renamed from: e */
    private Uri f6764e;

    /* renamed from: f */
    private C2510n f6765f;

    /* renamed from: g */
    private C2510n f6766g;

    /* renamed from: h */
    private C2505i f6767h;

    /* renamed from: i */
    private long f6768i;

    /* renamed from: j */
    private long f6769j;

    /* renamed from: k */
    private long f6770k;

    /* renamed from: l */
    private C2467l f6771l;

    /* renamed from: m */
    private long f6772m;

    /* renamed from: n */
    private long f6773n;

    public C2461f(C2457b bVar, C2505i iVar, C2505i iVar2, C2459d dVar, C2466k kVar) {
        this.f6760a = bVar;
        this.f6761b = iVar2;
        if (kVar == null) {
            C2466k kVar2 = C2466k.f6781b;
        }
        C2494am amVar = null;
        if (iVar != null) {
            this.f6763d = iVar;
            this.f6762c = dVar != null ? new C2494am(iVar, dVar) : amVar;
            return;
        }
        this.f6763d = C2490ai.f6837a;
        this.f6762c = null;
    }

    /* renamed from: g */
    private final void m6486g() {
        C2505i iVar = this.f6767h;
        if (iVar != null) {
            try {
                iVar.mo5882d();
                this.f6766g = null;
                this.f6767h = null;
                C2467l lVar = this.f6771l;
                if (lVar != null) {
                    this.f6760a.mo5873f(lVar);
                    this.f6771l = null;
                }
            } catch (Throwable th) {
                this.f6766g = null;
                this.f6767h = null;
                C2467l lVar2 = this.f6771l;
                if (lVar2 != null) {
                    this.f6760a.mo5873f(lVar2);
                    this.f6771l = null;
                }
                throw th;
            }
        }
    }

    /* renamed from: h */
    private final void m6487h(C2510n nVar, boolean z) {
        C2505i iVar;
        C2510n nVar2;
        C2510n nVar3 = nVar;
        String str = nVar3.f6898h;
        int i = C2612ak.f7249a;
        C2467l a = this.f6760a.mo5868a(str, this.f6769j, this.f6770k);
        if (a == null) {
            iVar = this.f6763d;
            nVar2 = C2509m.m6615a(nVar3.f6891a, nVar3.f6892b, nVar3.f6895e, this.f6769j, this.f6770k, nVar3.f6898h, nVar3.f6899i);
        } else if (a.f6785d) {
            Uri fromFile = Uri.fromFile(a.f6786e);
            long j = a.f6783b;
            long j2 = this.f6769j - j;
            long j3 = a.f6784c - j2;
            long j4 = this.f6770k;
            if (j4 != -1) {
                j3 = Math.min(j3, j4);
            }
            nVar2 = C2509m.m6615a(fromFile, j, nVar3.f6895e, j2, j3, nVar3.f6898h, nVar3.f6899i);
            iVar = this.f6761b;
        } else {
            long j5 = a.f6784c;
            if (j5 == -1) {
                j5 = this.f6770k;
            } else {
                long j6 = this.f6770k;
                if (j6 != -1) {
                    j5 = Math.min(j5, j6);
                }
            }
            nVar2 = C2509m.m6615a(nVar3.f6891a, nVar3.f6892b, nVar3.f6895e, this.f6769j, j5, nVar3.f6898h, nVar3.f6899i);
            iVar = this.f6762c;
            if (iVar == null) {
                iVar = this.f6763d;
                this.f6760a.mo5873f(a);
                a = null;
            }
        }
        C2505i iVar2 = this.f6763d;
        this.f6773n = iVar == iVar2 ? this.f6769j + 102400 : Long.MAX_VALUE;
        if (z) {
            C2601a.m6832d(this.f6767h == iVar2);
            if (iVar != this.f6763d) {
                try {
                    m6486g();
                } catch (Throwable th) {
                    Throwable th2 = th;
                    if (a.mo5891b()) {
                        this.f6760a.mo5873f(a);
                    }
                    throw th2;
                }
            } else {
                return;
            }
        }
        if (a != null && a.mo5891b()) {
            this.f6771l = a;
        }
        this.f6767h = iVar;
        this.f6766g = nVar2;
        this.f6768i = 0;
        long b = iVar.mo5880b(nVar2);
        C2475t tVar = new C2475t();
        if (nVar2.f6897g == -1 && b != -1) {
            this.f6770k = b;
            tVar.mo5908b(this.f6769j + b);
        }
        if (m6489j()) {
            this.f6764e = iVar.mo5881c();
            Uri uri = !nVar3.f6891a.equals(this.f6764e) ? this.f6764e : null;
            if (uri == null) {
                tVar.f6809b.add("exo_redir");
                tVar.f6808a.remove("exo_redir");
            } else {
                tVar.mo5907a("exo_redir", uri.toString());
            }
        }
        if (m6490k()) {
            this.f6760a.mo5871d(str, tVar);
        }
    }

    /* renamed from: i */
    private final boolean m6488i() {
        return this.f6767h == this.f6761b;
    }

    /* renamed from: j */
    private final boolean m6489j() {
        return !m6488i();
    }

    /* renamed from: k */
    private final boolean m6490k() {
        return this.f6767h == this.f6762c;
    }

    /* renamed from: a */
    public final int mo5879a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (this.f6770k == 0) {
            return -1;
        }
        C2510n nVar = this.f6765f;
        nVar.getClass();
        C2510n nVar2 = this.f6766g;
        nVar2.getClass();
        if (this.f6769j >= this.f6773n) {
            m6487h(nVar, true);
        }
        C2505i iVar = this.f6767h;
        iVar.getClass();
        int a = iVar.mo5879a(bArr, i, i2);
        if (a != -1) {
            if (m6488i()) {
                this.f6772m += (long) a;
            }
            long j = (long) a;
            this.f6769j += j;
            this.f6768i += j;
            long j2 = this.f6770k;
            if (j2 != -1) {
                this.f6770k = j2 - j;
            }
        } else {
            if (m6489j()) {
                long j3 = nVar2.f6897g;
                if (j3 == -1 || this.f6768i < j3) {
                    String str = nVar.f6898h;
                    int i3 = C2612ak.f7249a;
                    this.f6770k = 0;
                    if (m6490k()) {
                        C2475t tVar = new C2475t();
                        tVar.mo5908b(this.f6769j);
                        this.f6760a.mo5871d(str, tVar);
                    }
                }
            }
            long j4 = this.f6770k;
            if (j4 <= 0) {
                if (j4 == -1) {
                }
            }
            m6486g();
            m6487h(nVar, false);
            return mo5879a(bArr, i, i2);
        }
        return a;
    }

    /* renamed from: b */
    public final long mo5880b(C2510n nVar) {
        Uri uri;
        long j;
        int i = C2465j.f6780a;
        String str = nVar.f6898h;
        if (str == null) {
            str = nVar.f6891a.toString();
        }
        String str2 = str;
        C2510n a = C2509m.m6615a(nVar.f6891a, nVar.f6892b, nVar.f6895e, nVar.f6896f, nVar.f6897g, str2, nVar.f6899i);
        this.f6765f = a;
        C2457b bVar = this.f6760a;
        Uri uri2 = a.f6891a;
        String b = bVar.mo5869b(str2).mo5906b();
        if (b == null) {
            uri = null;
        } else {
            uri = Uri.parse(b);
        }
        if (uri != null) {
            uri2 = uri;
        }
        this.f6764e = uri2;
        this.f6769j = nVar.f6896f;
        long a2 = this.f6760a.mo5869b(str2).mo5905a();
        this.f6770k = a2;
        if (a2 != -1) {
            a2 -= nVar.f6896f;
            this.f6770k = a2;
            if (a2 < 0) {
                throw new C2506j(2008);
            }
        }
        long j2 = nVar.f6897g;
        if (j2 != -1) {
            j = j != -1 ? Math.min(j, j2) : j2;
            this.f6770k = j;
        }
        if (j > 0 || j == -1) {
            m6487h(a, false);
        }
        long j3 = nVar.f6897g;
        return j3 != -1 ? j3 : this.f6770k;
    }

    /* renamed from: c */
    public final Uri mo5881c() {
        return this.f6764e;
    }

    /* renamed from: e */
    public final Map mo5883e() {
        if (m6489j()) {
            return this.f6763d.mo5883e();
        }
        return Collections.emptyMap();
    }

    /* renamed from: d */
    public final void mo5882d() {
        this.f6765f = null;
        this.f6764e = null;
        this.f6769j = 0;
        m6486g();
    }

    /* renamed from: f */
    public final void mo5884f(C2495an anVar) {
        anVar.getClass();
        this.f6761b.mo5884f(anVar);
        this.f6763d.mo5884f(anVar);
    }
}
