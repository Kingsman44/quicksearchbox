package androidx.media3.p132b;

import android.content.Context;
import android.net.Uri;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.common.p136b.C2633u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.media3.b.p */
/* compiled from: PG */
public final class C2512p implements C2505i {

    /* renamed from: a */
    private final Context f6902a;

    /* renamed from: b */
    private final List f6903b = new ArrayList();

    /* renamed from: c */
    private final C2505i f6904c;

    /* renamed from: d */
    private C2505i f6905d;

    /* renamed from: e */
    private C2505i f6906e;

    /* renamed from: f */
    private C2505i f6907f;

    /* renamed from: g */
    private C2505i f6908g;

    /* renamed from: h */
    private C2505i f6909h;

    /* renamed from: i */
    private C2505i f6910i;

    /* renamed from: j */
    private C2505i f6911j;

    /* renamed from: k */
    private C2505i f6912k;

    public C2512p(Context context, C2505i iVar) {
        this.f6902a = context.getApplicationContext();
        iVar.getClass();
        this.f6904c = iVar;
    }

    /* renamed from: g */
    private final C2505i m6621g() {
        if (this.f6906e == null) {
            C2498b bVar = new C2498b(this.f6902a);
            this.f6906e = bVar;
            m6622h(bVar);
        }
        return this.f6906e;
    }

    /* renamed from: h */
    private final void m6622h(C2505i iVar) {
        for (int i = 0; i < this.f6903b.size(); i++) {
            iVar.mo5884f((C2495an) this.f6903b.get(i));
        }
    }

    /* renamed from: i */
    private static final void m6623i(C2505i iVar, C2495an anVar) {
        if (iVar != null) {
            iVar.mo5884f(anVar);
        }
    }

    /* renamed from: b */
    public final long mo5880b(C2510n nVar) {
        C2505i iVar;
        C2601a.m6832d(this.f6912k == null);
        String scheme = nVar.f6891a.getScheme();
        if (C2612ak.m6958ah(nVar.f6891a)) {
            String path = nVar.f6891a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f6905d == null) {
                    C2522z zVar = new C2522z();
                    this.f6905d = zVar;
                    m6622h(zVar);
                }
                this.f6912k = this.f6905d;
            } else {
                this.f6912k = m6621g();
            }
        } else if ("asset".equals(scheme)) {
            this.f6912k = m6621g();
        } else if ("content".equals(scheme)) {
            if (this.f6907f == null) {
                C2502f fVar = new C2502f(this.f6902a);
                this.f6907f = fVar;
                m6622h(fVar);
            }
            this.f6912k = this.f6907f;
        } else if ("rtmp".equals(scheme)) {
            if (this.f6908g == null) {
                try {
                    C2505i iVar2 = (C2505i) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                    this.f6908g = iVar2;
                    m6622h(iVar2);
                } catch (ClassNotFoundException unused) {
                    C2633u.m7050e("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating RTMP extension", e);
                }
                if (this.f6908g == null) {
                    this.f6908g = this.f6904c;
                }
            }
            this.f6912k = this.f6908g;
        } else if ("udp".equals(scheme)) {
            if (this.f6909h == null) {
                C2497ap apVar = new C2497ap((byte[]) null);
                this.f6909h = apVar;
                m6622h(apVar);
            }
            this.f6912k = this.f6909h;
        } else if ("data".equals(scheme)) {
            if (this.f6910i == null) {
                C2503g gVar = new C2503g();
                this.f6910i = gVar;
                m6622h(gVar);
            }
            this.f6912k = this.f6910i;
        } else {
            if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.f6911j == null) {
                    C2492ak akVar = new C2492ak(this.f6902a);
                    this.f6911j = akVar;
                    m6622h(akVar);
                }
                iVar = this.f6911j;
            } else {
                iVar = this.f6904c;
            }
            this.f6912k = iVar;
        }
        return this.f6912k.mo5880b(nVar);
    }

    /* renamed from: c */
    public final Uri mo5881c() {
        C2505i iVar = this.f6912k;
        if (iVar == null) {
            return null;
        }
        return iVar.mo5881c();
    }

    /* renamed from: d */
    public final void mo5882d() {
        C2505i iVar = this.f6912k;
        if (iVar != null) {
            try {
                iVar.mo5882d();
            } finally {
                this.f6912k = null;
            }
        }
    }

    /* renamed from: e */
    public final Map mo5883e() {
        C2505i iVar = this.f6912k;
        return iVar == null ? Collections.emptyMap() : iVar.mo5883e();
    }

    /* renamed from: a */
    public final int mo5879a(byte[] bArr, int i, int i2) {
        C2505i iVar = this.f6912k;
        iVar.getClass();
        return iVar.mo5879a(bArr, i, i2);
    }

    /* renamed from: f */
    public final void mo5884f(C2495an anVar) {
        anVar.getClass();
        this.f6904c.mo5884f(anVar);
        this.f6903b.add(anVar);
        m6623i(this.f6905d, anVar);
        m6623i(this.f6906e, anVar);
        m6623i(this.f6907f, anVar);
        m6623i(this.f6908g, anVar);
        m6623i(this.f6909h, anVar);
        m6623i(this.f6910i, anVar);
        m6623i(this.f6911j, anVar);
    }
}
