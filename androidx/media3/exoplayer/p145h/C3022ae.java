package androidx.media3.exoplayer.p145h;

import android.content.Context;
import android.net.Uri;
import androidx.media3.common.C2576ac;
import androidx.media3.common.C2578ae;
import androidx.media3.common.C2582ai;
import androidx.media3.common.C2583aj;
import androidx.media3.common.C2584ak;
import androidx.media3.common.C2589ap;
import androidx.media3.common.C2590aq;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.exoplayer.p151k.C3245k;
import androidx.media3.extractor.C3331af;
import androidx.media3.extractor.C3632v;
import androidx.media3.p132b.C2504h;
import androidx.media3.p132b.C2511o;
import com.google.common.base.C58881cr;
import com.google.common.p4522b.C58485gu;
import java.util.Map;

/* renamed from: androidx.media3.exoplayer.h.ae */
/* compiled from: PG */
public final class C3022ae implements C3035ar {

    /* renamed from: a */
    public final C3021ad f8758a;

    /* renamed from: b */
    private C2504h f8759b;

    /* renamed from: c */
    private long f8760c;

    /* renamed from: d */
    private long f8761d;

    /* renamed from: e */
    private long f8762e;

    /* renamed from: f */
    private float f8763f;

    /* renamed from: g */
    private float f8764g;

    public C3022ae(Context context, C3331af afVar) {
        this((C2504h) new C2511o(context), afVar);
    }

    /* renamed from: a */
    public static C3035ar m8615a(Class cls, C2504h hVar) {
        try {
            return (C3035ar) cls.getConstructor(new Class[]{C2504h.class}).newInstance(new Object[]{hVar});
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: b */
    public final C3038au mo6760b(C2590aq aqVar) {
        C2584ak akVar = aqVar.f7154c;
        akVar.getClass();
        String scheme = akVar.f7131a.getScheme();
        if (scheme == null || !scheme.equals("ssai")) {
            C2584ak akVar2 = aqVar.f7154c;
            Uri uri = akVar2.f7131a;
            String str = akVar2.f7132b;
            int p = C2612ak.m6991p(uri);
            C3021ad adVar = this.f8758a;
            Map map = adVar.f8756d;
            Integer valueOf = Integer.valueOf(p);
            C3035ar arVar = (C3035ar) map.get(valueOf);
            if (arVar == null) {
                C58881cr a = adVar.mo6966a(p);
                if (a == null) {
                    arVar = null;
                } else {
                    arVar = (C3035ar) a.mo6453a();
                    adVar.f8756d.put(valueOf, arVar);
                }
            }
            C2601a.m6835g(arVar, "No suitable media source factory found for content type: " + p);
            C2583aj ajVar = aqVar.f7156e;
            C2582ai aiVar = new C2582ai(ajVar);
            if (ajVar.f7126a == -9223372036854775807L) {
                aiVar.f7121a = this.f8760c;
            }
            if (ajVar.f7129d == -3.4028235E38f) {
                aiVar.f7124d = this.f8763f;
            }
            if (ajVar.f7130e == -3.4028235E38f) {
                aiVar.f7125e = this.f8764g;
            }
            if (ajVar.f7127b == -9223372036854775807L) {
                aiVar.f7122b = this.f8761d;
            }
            if (ajVar.f7128c == -9223372036854775807L) {
                aiVar.f7123c = this.f8762e;
            }
            C2583aj ajVar2 = new C2583aj(aiVar);
            if (!ajVar2.equals(ajVar)) {
                C2576ac acVar = new C2576ac(aqVar);
                acVar.f7108f = new C2582ai(ajVar2);
                aqVar = acVar.mo6082a();
            }
            C3038au b = arVar.mo6760b(aqVar);
            C58485gu guVar = aqVar.f7154c.f7137g;
            if (!guVar.isEmpty()) {
                C3038au[] auVarArr = new C3038au[(guVar.size() + 1)];
                int i = 0;
                auVarArr[0] = b;
                while (i < guVar.size()) {
                    C2504h hVar = this.f8759b;
                    hVar.getClass();
                    int i2 = i + 1;
                    auVarArr[i2] = C3103cn.m9018a((C2589ap) guVar.get(i), hVar, new C3245k((byte[]) null));
                    i = i2;
                }
                b = new C3072bj(auVarArr);
            }
            C2578ae aeVar = aqVar.f7158g;
            aqVar.f7154c.getClass();
            return b;
        }
        throw null;
    }

    public C3022ae(C2504h hVar) {
        this(hVar, (C3331af) new C3632v());
    }

    public C3022ae(C2504h hVar, C3331af afVar) {
        this.f8759b = hVar;
        C3021ad adVar = new C3021ad(afVar);
        this.f8758a = adVar;
        if (hVar != adVar.f8757e) {
            adVar.f8757e = hVar;
            adVar.f8754b.clear();
            adVar.f8756d.clear();
        }
        this.f8760c = -9223372036854775807L;
        this.f8761d = -9223372036854775807L;
        this.f8762e = -9223372036854775807L;
        this.f8763f = -3.4028235E38f;
        this.f8764g = -3.4028235E38f;
    }
}
