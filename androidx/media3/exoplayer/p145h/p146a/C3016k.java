package androidx.media3.exoplayer.p145h.p146a;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.common.C2576ac;
import androidx.media3.common.C2580ag;
import androidx.media3.common.C2590aq;
import androidx.media3.common.C2600b;
import androidx.media3.common.C2649bk;
import androidx.media3.common.C2651bm;
import androidx.media3.common.C2659c;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.exoplayer.p140d.C2905g;
import androidx.media3.exoplayer.p145h.C3021ad;
import androidx.media3.exoplayer.p145h.C3022ae;
import androidx.media3.exoplayer.p145h.C3028ak;
import androidx.media3.exoplayer.p145h.C3034aq;
import androidx.media3.exoplayer.p145h.C3035ar;
import androidx.media3.exoplayer.p145h.C3036as;
import androidx.media3.exoplayer.p145h.C3038au;
import androidx.media3.exoplayer.p145h.C3115j;
import androidx.media3.exoplayer.p151k.C3241g;
import androidx.media3.p132b.C2495an;
import androidx.media3.p132b.C2510n;
import com.google.android.libraries.p579ar.sceneviewer.media.MediaUtilities;
import com.google.android.libraries.search.video.thirdparty.C41601c;
import com.google.common.p4575r.C60757n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: androidx.media3.exoplayer.h.a.k */
/* compiled from: PG */
public final class C3016k extends C3115j {

    /* renamed from: i */
    private static final C3036as f8734i = new C3036as(new Object());

    /* renamed from: a */
    public final C3006a f8735a;

    /* renamed from: b */
    public final C2510n f8736b;

    /* renamed from: c */
    public final Object f8737c;

    /* renamed from: d */
    public final Handler f8738d = new Handler(Looper.getMainLooper());

    /* renamed from: e */
    public final C2649bk f8739e = new C2649bk();

    /* renamed from: f */
    public C2659c f8740f;

    /* renamed from: g */
    public C3010e[][] f8741g = new C3010e[0][];

    /* renamed from: h */
    public final C41601c f8742h;

    /* renamed from: j */
    private final C3038au f8743j;

    /* renamed from: k */
    private final C3035ar f8744k;

    /* renamed from: l */
    private C3015j f8745l;

    /* renamed from: m */
    private C2651bm f8746m;

    public C3016k(C3038au auVar, C2510n nVar, Object obj, C3035ar arVar, C3006a aVar, C41601c cVar) {
        this.f8743j = auVar;
        this.f8744k = arVar;
        this.f8735a = aVar;
        this.f8742h = cVar;
        this.f8736b = nVar;
        this.f8737c = obj;
        C3021ad adVar = ((C3022ae) arVar).f8758a;
        adVar.mo6966a(0);
        adVar.mo6966a(1);
        adVar.mo6966a(2);
        adVar.mo6966a(3);
        adVar.mo6966a(4);
        int[] m = C60757n.m92752m(adVar.f8755c);
        ArrayList arrayList = new ArrayList();
        for (int i : m) {
            if (i == 0) {
                arrayList.add("application/dash+xml");
            } else if (i == 2) {
                arrayList.add("application/x-mpegURL");
            } else if (i == 4) {
                arrayList.addAll(Arrays.asList(new String[]{MediaUtilities.MIME_TYPE, "video/webm", "video/3gpp", "audio/mp4", "audio/mpeg"}));
            }
        }
        ((C2905g) aVar).f8258h = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: E */
    public final void mo6962E() {
        C2651bm bmVar;
        C2651bm bmVar2 = this.f8746m;
        C2659c cVar = this.f8740f;
        if (cVar == null || bmVar2 == null) {
        } else if (cVar.f7415c == 0) {
            mo6952y(bmVar2);
        } else {
            long[][] jArr = new long[this.f8741g.length][];
            int i = 0;
            int i2 = 0;
            while (true) {
                C3010e[][] eVarArr = this.f8741g;
                if (i2 >= eVarArr.length) {
                    break;
                }
                jArr[i2] = new long[eVarArr[i2].length];
                int i3 = 0;
                while (true) {
                    C3010e[] eVarArr2 = this.f8741g[i2];
                    if (i3 >= eVarArr2.length) {
                        break;
                    }
                    C3010e eVar = eVarArr2[i3];
                    long[] jArr2 = jArr[i2];
                    long j = -9223372036854775807L;
                    if (!(eVar == null || (bmVar = eVar.f8721e) == null)) {
                        j = bmVar.mo6023d(0, eVar.f8722f.f8739e, false).f7331d;
                    }
                    jArr2[i3] = j;
                    i3++;
                }
                i2++;
            }
            C2600b[] bVarArr = cVar.f7419g;
            C2600b[] bVarArr2 = (C2600b[]) C2612ak.m6965ao(bVarArr, bVarArr.length);
            while (i < cVar.f7415c) {
                C2600b bVar = bVarArr2[i];
                long[] jArr3 = jArr[i];
                int length = jArr3.length;
                int length2 = bVar.f7220c.length;
                if (length < length2) {
                    jArr3 = C2600b.m6824f(jArr3, length2);
                } else if (bVar.f7219b != -1 && length > length2) {
                    jArr3 = Arrays.copyOf(jArr3, length2);
                }
                long j2 = bVar.f7218a;
                int i4 = bVar.f7219b;
                int[] iArr = bVar.f7221d;
                Uri[] uriArr = bVar.f7220c;
                long j3 = bVar.f7223f;
                boolean z = bVar.f7224g;
                bVarArr2[i] = new C2600b(j2, i4, iArr, uriArr, jArr3);
                i++;
                bmVar2 = bmVar2;
            }
            C2651bm bmVar3 = bmVar2;
            this.f8740f = new C2659c(cVar.f7414b, bVarArr2, cVar.f7416d, cVar.f7417e);
            mo6952y(new C3017l(bmVar3, this.f8740f));
        }
    }

    /* renamed from: a */
    public final C2590aq mo6745a() {
        return this.f8743j.mo6745a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C3036as mo6963d(Object obj, C3036as asVar) {
        C3036as asVar2 = (C3036as) obj;
        return asVar2.mo6102a() ? asVar2 : asVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo6750f(C2495an anVar) {
        super.mo6750f(anVar);
        C3015j jVar = new C3015j(this);
        this.f8745l = jVar;
        mo7104k(f8734i, this.f8743j);
        this.f8738d.post(new C3007b(this, jVar));
    }

    /* renamed from: h */
    public final void mo6752h(C3034aq aqVar) {
        C3028ak akVar = (C3028ak) aqVar;
        C3036as asVar = akVar.f8773a;
        if (asVar.mo6102a()) {
            C3010e eVar = this.f8741g[asVar.f7205b][asVar.f7206c];
            eVar.getClass();
            eVar.f8718b.remove(akVar);
            akVar.mo6968p();
            if (eVar.f8718b.isEmpty()) {
                if (eVar.mo6956a()) {
                    eVar.f8722f.mo7105l(eVar.f8717a);
                }
                this.f8741g[asVar.f7205b][asVar.f7206c] = null;
                return;
            }
            return;
        }
        akVar.mo6968p();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo6753i() {
        super.mo6753i();
        C3015j jVar = this.f8745l;
        jVar.getClass();
        this.f8745l = null;
        jVar.f8732b = true;
        jVar.f8731a.removeCallbacksAndMessages((Object) null);
        this.f8746m = null;
        this.f8740f = null;
        this.f8741g = new C3010e[0][];
        this.f8738d.post(new C3008c(this, jVar));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r0v3, types: [int] */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void mo6964j(java.lang.Object r6, androidx.media3.exoplayer.p145h.C3038au r7, androidx.media3.common.C2651bm r8) {
        /*
            r5 = this;
            androidx.media3.exoplayer.h.as r6 = (androidx.media3.exoplayer.p145h.C3036as) r6
            boolean r7 = r6.mo6102a()
            r0 = 0
            r1 = 1
            if (r7 == 0) goto L_0x004c
            int r7 = r6.f7205b
            int r6 = r6.f7206c
            androidx.media3.exoplayer.h.a.e[][] r2 = r5.f8741g
            r7 = r2[r7]
            r6 = r7[r6]
            r6.getClass()
            int r7 = r8.mo6021b()
            if (r7 != r1) goto L_0x001e
            goto L_0x001f
        L_0x001e:
            r1 = 0
        L_0x001f:
            androidx.media3.common.p136b.C2601a.m6830b(r1)
            androidx.media3.common.bm r7 = r6.f8721e
            if (r7 != 0) goto L_0x0049
            java.lang.Object r7 = r8.mo6026f(r0)
        L_0x002a:
            java.util.List r1 = r6.f8718b
            int r1 = r1.size()
            if (r0 >= r1) goto L_0x0049
            java.util.List r1 = r6.f8718b
            java.lang.Object r1 = r1.get(r0)
            androidx.media3.exoplayer.h.ak r1 = (androidx.media3.exoplayer.p145h.C3028ak) r1
            androidx.media3.exoplayer.h.as r2 = new androidx.media3.exoplayer.h.as
            androidx.media3.exoplayer.h.as r3 = r1.f8773a
            long r3 = r3.f7207d
            r2.<init>(r7, r3)
            r1.mo6967k(r2)
            int r0 = r0 + 1
            goto L_0x002a
        L_0x0049:
            r6.f8721e = r8
            goto L_0x0058
        L_0x004c:
            int r6 = r8.mo6021b()
            if (r6 != r1) goto L_0x0053
            r0 = 1
        L_0x0053:
            androidx.media3.common.p136b.C2601a.m6830b(r0)
            r5.f8746m = r8
        L_0x0058:
            r5.mo6962E()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.p145h.p146a.C3016k.mo6964j(java.lang.Object, androidx.media3.exoplayer.h.au, androidx.media3.common.bm):void");
    }

    /* renamed from: n */
    public final void mo6965n() {
        Uri uri;
        C2659c cVar = this.f8740f;
        if (cVar != null) {
            for (int i = 0; i < this.f8741g.length; i++) {
                int i2 = 0;
                while (true) {
                    C3010e[] eVarArr = this.f8741g[i];
                    if (i2 >= eVarArr.length) {
                        break;
                    }
                    C3010e eVar = eVarArr[i2];
                    C2600b c = cVar.mo6321c(i);
                    if (eVar != null && !eVar.mo6956a()) {
                        Uri[] uriArr = c.f7220c;
                        if (i2 < uriArr.length && (uri = uriArr[i2]) != null) {
                            C2576ac acVar = new C2576ac();
                            acVar.f7104b = uri;
                            if (this.f8743j.mo6745a().f7154c != null) {
                                acVar.f7105c = new C2580ag();
                            }
                            C3038au b = this.f8744k.mo6760b(acVar.mo6082a());
                            eVar.f8720d = b;
                            eVar.f8719c = uri;
                            for (int i3 = 0; i3 < eVar.f8718b.size(); i3++) {
                                C3028ak akVar = (C3028ak) eVar.f8718b.get(i3);
                                akVar.mo6969q(b);
                                akVar.f8776d = new C3013h(eVar.f8722f, uri);
                            }
                            eVar.f8722f.mo7104k(eVar.f8717a, b);
                        }
                    }
                    i2++;
                }
            }
        }
    }

    /* renamed from: m */
    public final C3034aq mo6757m(C3036as asVar, C3241g gVar, long j) {
        C2659c cVar = this.f8740f;
        cVar.getClass();
        if (cVar.f7415c <= 0 || !asVar.mo6102a()) {
            C3028ak akVar = new C3028ak(asVar, gVar, j);
            akVar.mo6969q(this.f8743j);
            akVar.mo6967k(asVar);
            return akVar;
        }
        int i = asVar.f7205b;
        int i2 = asVar.f7206c;
        C3010e[][] eVarArr = this.f8741g;
        C3010e[] eVarArr2 = eVarArr[i];
        if (eVarArr2.length <= i2) {
            eVarArr[i] = (C3010e[]) Arrays.copyOf(eVarArr2, i2 + 1);
        }
        C3010e eVar = this.f8741g[i][i2];
        if (eVar == null) {
            eVar = new C3010e(this, asVar);
            this.f8741g[i][i2] = eVar;
            mo6965n();
        }
        C3028ak akVar2 = new C3028ak(asVar, gVar, j);
        eVar.f8718b.add(akVar2);
        C3038au auVar = eVar.f8720d;
        if (auVar != null) {
            akVar2.mo6969q(auVar);
            C3016k kVar = eVar.f8722f;
            Uri uri = eVar.f8719c;
            uri.getClass();
            akVar2.f8776d = new C3013h(kVar, uri);
        }
        C2651bm bmVar = eVar.f8721e;
        if (bmVar != null) {
            akVar2.mo6967k(new C3036as(bmVar.mo6026f(0), asVar.f7207d));
        }
        return akVar2;
    }
}
