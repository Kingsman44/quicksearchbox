package androidx.media3.extractor.p158e;

import androidx.media3.common.C2679w;
import androidx.media3.common.C2680x;
import androidx.media3.common.Metadata;
import androidx.media3.common.p136b.C2604ac;
import androidx.media3.extractor.C3326aa;
import androidx.media3.extractor.C3327ab;
import androidx.media3.extractor.C3329ad;
import androidx.media3.extractor.C3350ay;
import androidx.media3.extractor.C3363ba;
import androidx.media3.extractor.C3368bf;
import androidx.media3.extractor.C3627q;
import androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata;
import androidx.media3.extractor.p161h.C3432s;
import androidx.media3.extractor.p161h.C3436w;
import com.google.android.libraries.p579ar.sceneviewer.media.MediaUtilities;

/* renamed from: androidx.media3.extractor.e.a */
/* compiled from: PG */
public final class C3388a implements C3326aa {

    /* renamed from: a */
    private final C2604ac f10258a = new C2604ac(6);

    /* renamed from: b */
    private C3329ad f10259b;

    /* renamed from: c */
    private int f10260c;

    /* renamed from: d */
    private int f10261d;

    /* renamed from: e */
    private int f10262e;

    /* renamed from: f */
    private long f10263f = -1;

    /* renamed from: g */
    private MotionPhotoMetadata f10264g;

    /* renamed from: h */
    private C3327ab f10265h;

    /* renamed from: i */
    private C3391d f10266i;

    /* renamed from: j */
    private C3432s f10267j;

    /* renamed from: f */
    private final int m9796f(C3327ab abVar) {
        this.f10258a.mo6156x(2);
        ((C3627q) abVar).mo7320o(this.f10258a.f7234a, 0, 2, false);
        return this.f10258a.mo6142j();
    }

    /* renamed from: g */
    private final void m9797g() {
        m9798h(new Metadata.Entry[0]);
        C3329ad adVar = this.f10259b;
        adVar.getClass();
        adVar.mo6988fa();
        this.f10259b.mo6989q(new C3363ba(-9223372036854775807L, 0));
        this.f10260c = 6;
    }

    /* renamed from: c */
    public final void mo7153c() {
    }

    /* renamed from: e */
    public final boolean mo7155e(C3327ab abVar) {
        if (m9796f(abVar) != 65496) {
            return false;
        }
        int f = m9796f(abVar);
        this.f10261d = f;
        if (f == 65504) {
            this.f10258a.mo6156x(2);
            C3627q qVar = (C3627q) abVar;
            qVar.mo7320o(this.f10258a.f7234a, 0, 2, false);
            qVar.mo7319n(this.f10258a.mo6142j() - 2, false);
            f = m9796f(abVar);
            this.f10261d = f;
        }
        if (f == 65505) {
            C3627q qVar2 = (C3627q) abVar;
            qVar2.mo7319n(2, false);
            this.f10258a.mo6156x(6);
            qVar2.mo7320o(this.f10258a.f7234a, 0, 6, false);
            if (this.f10258a.mo6146n() == 1165519206 && this.f10258a.mo6142j() == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: s */
    public final void mo7156s(C3329ad adVar) {
        this.f10259b = adVar;
    }

    /* renamed from: d */
    public final void mo7154d(long j, long j2) {
        if (j == 0) {
            this.f10260c = 0;
            this.f10267j = null;
        } else if (this.f10260c == 5) {
            C3432s sVar = this.f10267j;
            sVar.getClass();
            sVar.mo7154d(j, j2);
        }
    }

    /* renamed from: h */
    private final void m9798h(Metadata.Entry... entryArr) {
        C3329ad adVar = this.f10259b;
        adVar.getClass();
        C3368bf eZ = adVar.mo6987eZ(1024, 4);
        C2679w wVar = new C2679w();
        wVar.f7458j = "image/jpeg";
        wVar.f7457i = new Metadata(-9223372036854775807L, entryArr);
        eZ.mo6850b(new C2680x(wVar));
    }

    /* renamed from: a */
    public final int mo7152a(C3327ab abVar, C3350ay ayVar) {
        String B;
        C3390c a;
        long j;
        C3327ab abVar2 = abVar;
        C3350ay ayVar2 = ayVar;
        int i = this.f10260c;
        if (i == 0) {
            this.f10258a.mo6156x(2);
            ((C3627q) abVar2).mo7321p(this.f10258a.f7234a, 0, 2, false);
            int j2 = this.f10258a.mo6142j();
            this.f10261d = j2;
            if (j2 == 65498) {
                if (this.f10263f != -1) {
                    this.f10260c = 4;
                } else {
                    m9797g();
                }
            } else if ((j2 < 65488 || j2 > 65497) && j2 != 65281) {
                this.f10260c = 1;
            }
            return 0;
        } else if (i != 1) {
            MotionPhotoMetadata motionPhotoMetadata = null;
            if (i == 2) {
                if (this.f10261d == 65505) {
                    C2604ac acVar = new C2604ac(this.f10262e);
                    C3627q qVar = (C3627q) abVar2;
                    qVar.mo7321p(acVar.f7234a, 0, this.f10262e, false);
                    if (this.f10264g == null && "http://ns.adobe.com/xap/1.0/".equals(acVar.mo6132B()) && (B = acVar.mo6132B()) != null) {
                        long j3 = qVar.f11565b;
                        if (!(j3 == -1 || (a = C3394g.m9813a(B)) == null || a.f10272b.size() < 2)) {
                            long j4 = -1;
                            long j5 = -1;
                            long j6 = -1;
                            long j7 = -1;
                            boolean z = false;
                            for (int size = a.f10272b.size() - 1; size >= 0; size--) {
                                C3389b bVar = (C3389b) a.f10272b.get(size);
                                z |= MediaUtilities.MIME_TYPE.equals(bVar.f10268a);
                                if (size == 0) {
                                    j3 -= bVar.f10270c;
                                    j = 0;
                                } else {
                                    j = j3 - bVar.f10269b;
                                }
                                long j8 = j3;
                                j3 = j;
                                long j9 = j8;
                                if (z && j3 != j9) {
                                    j7 = j9 - j3;
                                    j6 = j3;
                                    z = false;
                                }
                                if (size == 0) {
                                    j5 = j9;
                                }
                                if (size == 0) {
                                    j4 = j3;
                                }
                            }
                            motionPhotoMetadata = (j6 == -1 || j7 == -1 || j4 == -1 || j5 == -1) ? null : new MotionPhotoMetadata(j4, j5, a.f10271a, j6, j7);
                        }
                        this.f10264g = motionPhotoMetadata;
                        if (motionPhotoMetadata != null) {
                            this.f10263f = motionPhotoMetadata.f11509d;
                        }
                    }
                } else {
                    ((C3627q) abVar2).mo7639q(this.f10262e);
                }
                this.f10260c = 0;
                return 0;
            } else if (i == 4) {
                C3627q qVar2 = (C3627q) abVar2;
                long j10 = qVar2.f11566c;
                long j11 = this.f10263f;
                if (j10 == j11) {
                    if (!abVar2.mo7320o(this.f10258a.f7234a, 0, 1, true)) {
                        m9797g();
                    } else {
                        qVar2.f11568e = 0;
                        if (this.f10267j == null) {
                            this.f10267j = new C3432s((byte[]) null);
                        }
                        C3391d dVar = new C3391d(abVar2, this.f10263f);
                        this.f10266i = dVar;
                        if (C3436w.m9957a(dVar, false)) {
                            C3432s sVar = this.f10267j;
                            long j12 = this.f10263f;
                            C3329ad adVar = this.f10259b;
                            adVar.getClass();
                            sVar.f10552a = new C3393f(j12, adVar);
                            MotionPhotoMetadata motionPhotoMetadata2 = this.f10264g;
                            motionPhotoMetadata2.getClass();
                            m9798h(motionPhotoMetadata2);
                            this.f10260c = 5;
                        } else {
                            m9797g();
                        }
                    }
                    return 0;
                }
                ayVar2.f10122a = j11;
                return 1;
            } else if (i == 5) {
                if (this.f10266i == null || abVar2 != this.f10265h) {
                    this.f10265h = abVar2;
                    this.f10266i = new C3391d(abVar2, this.f10263f);
                }
                C3432s sVar2 = this.f10267j;
                sVar2.getClass();
                int a2 = sVar2.mo7152a(this.f10266i, ayVar2);
                if (a2 != 1) {
                    return a2;
                }
                ayVar2.f10122a += this.f10263f;
                return 1;
            } else if (i == 6) {
                return -1;
            } else {
                throw new IllegalStateException();
            }
        } else {
            this.f10258a.mo6156x(2);
            ((C3627q) abVar2).mo7321p(this.f10258a.f7234a, 0, 2, false);
            this.f10262e = this.f10258a.mo6142j() - 2;
            this.f10260c = 2;
            return 0;
        }
    }
}
