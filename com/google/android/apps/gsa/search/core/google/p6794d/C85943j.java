package com.google.android.apps.gsa.search.core.google.p6794d;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p6968aa.C89051g;
import com.google.android.apps.gsa.shared.p6968aa.C89068x;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4534f.C59081b;
import com.google.common.util.concurrent.C60870cx;
import com.google.p395al.p417d.p418a.C8523ac;
import com.google.p395al.p417d.p418a.C8533am;
import com.google.p395al.p417d.p418a.C8596w;
import com.google.p4017at.p4060h.p4068b.p4069a.C54196m;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protobuf.MessageLite;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: com.google.android.apps.gsa.search.core.google.d.j */
/* compiled from: PG */
public final class C85943j implements C85934a, C22868d {

    /* renamed from: a */
    private static final C59071e f232372a = C59071e.m91332i("com.google.android.apps.gsa.search.core.google.d.j");

    /* renamed from: b */
    private final C89068x f232373b;

    /* renamed from: c */
    private final C85948o f232374c;

    /* renamed from: d */
    private final Queue f232375d;

    /* renamed from: e */
    private final C85940g f232376e;

    /* renamed from: f */
    private final C22871g f232377f;

    /* renamed from: g */
    private final int f232378g;

    /* renamed from: h */
    private int f232379h = -1;

    /* renamed from: i */
    private int f232380i = 0;

    /* renamed from: j */
    private int f232381j = 0;

    /* renamed from: k */
    private int f232382k = 0;

    public C85943j(C89068x xVar, C85948o oVar, int i, C22871g gVar, int i2) {
        this.f232373b = xVar;
        this.f232374c = oVar;
        this.f232375d = new LinkedList();
        this.f232382k = i;
        this.f232377f = gVar;
        this.f232376e = new C85940g(xVar);
        this.f232378g = i2;
    }

    /* renamed from: d */
    static C89051g m138135d(Queue queue) {
        C89051g gVar = (C89051g) queue.remove();
        if (gVar.mo83020a() != 0) {
            ((C59052c) ((C59052c) f232372a.mo56226d()).mo56372aa(8088)).mo56386p("Did not read all the available bytes in the current chunk before releasing");
            int i = C90755l.f253831a;
        }
        gVar.mo83024e();
        return (C89051g) queue.peek();
    }

    /* renamed from: f */
    private final void m138136f(Throwable th) {
        for (C89051g e : this.f232375d) {
            e.mo83024e();
        }
        this.f232373b.mo27475d();
        this.f232374c.mo79616b(th);
    }

    /* renamed from: g */
    private final void m138137g(boolean z) {
        MessageLite messageLite;
        Object obj;
        Object obj2;
        while (true) {
            if (this.f232379h == -1) {
                if (!z) {
                    if (this.f232380i < 10) {
                        return;
                    }
                } else if (this.f232380i == 0) {
                    return;
                }
                Queue queue = this.f232375d;
                if (!queue.isEmpty()) {
                    C89051g gVar = (C89051g) queue.peek();
                    byte[] bArr = new byte[1];
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        if (i >= 32) {
                            while (i < 64) {
                                if (gVar != null) {
                                    try {
                                        if (gVar.mo83021b(bArr, 0, 1) != 1) {
                                            throw new C90457d("EOF before 64 bits", (int) C89885b.GWS_BAD_PELLET_PROTO_SIZE_VALUE);
                                        } else if ((bArr[0] & 128) != 0) {
                                            if (gVar.mo83020a() == 0) {
                                                gVar = m138135d(queue);
                                            }
                                            i += 7;
                                        }
                                    } catch (IOException e) {
                                        throw new C90457d((Throwable) e, (int) C89885b.GWS_READ_PELLET_PROTO_SIZE_VALUE);
                                    }
                                } else {
                                    throw new C90457d("Not enough bytes to read the int", (int) C89885b.GWS_READ_PELLET_PROTO_SIZE_VALUE);
                                }
                            }
                            throw new C90457d("Finished without valid varint", (int) C89885b.GWS_BAD_PELLET_PROTO_SIZE_VALUE);
                        } else if (gVar != null) {
                            try {
                                if (gVar.mo83021b(bArr, 0, 1) == 1) {
                                    byte b = bArr[0];
                                    i2 |= (b & Byte.MAX_VALUE) << i;
                                    if ((b & 128) == 0) {
                                        break;
                                    }
                                    if (gVar.mo83020a() == 0) {
                                        gVar = m138135d(queue);
                                    }
                                    i += 7;
                                } else {
                                    throw new C90457d("EOF before 32 bits", (int) C89885b.GWS_BAD_PELLET_PROTO_SIZE_VALUE);
                                }
                            } catch (IOException e2) {
                                throw new C90457d((Throwable) e2, (int) C89885b.GWS_READ_PELLET_PROTO_SIZE_VALUE);
                            }
                        } else {
                            throw new C90457d("Not enough bytes to read the int", (int) C89885b.GWS_READ_PELLET_PROTO_SIZE_VALUE);
                        }
                    }
                    this.f232379h = i2;
                    this.f232380i = 0;
                    for (C89051g a : this.f232375d) {
                        this.f232380i += a.mo83020a();
                    }
                } else {
                    throw new C90457d("Not enough bytes to read the int", (int) C89885b.GWS_READ_PELLET_PROTO_SIZE_VALUE);
                }
            }
            if (this.f232379h <= this.f232380i) {
                C89051g gVar2 = (C89051g) this.f232375d.peek();
                int i3 = this.f232379h;
                byte[] bArr2 = new byte[i3];
                int i4 = 0;
                while (i4 < this.f232379h) {
                    if (gVar2 != null) {
                        int a2 = gVar2.mo83020a();
                        int min = Math.min(a2, this.f232379h - i4);
                        try {
                            int b2 = gVar2.mo83021b(bArr2, i4, min);
                            if (b2 == min) {
                                i4 += min;
                                if (a2 == min) {
                                    gVar2 = m138135d(this.f232375d);
                                }
                            } else {
                                ((C59052c) ((C59052c) f232372a.mo56226d()).mo56372aa(8087)).mo56393w("Expected %d bytes but read %d", min, b2);
                                throw new C90457d(C89885b.GWS_READ_PELLET_PROTO_CONTENT_VALUE);
                            }
                        } catch (IOException e3) {
                            throw new C90457d((Throwable) e3, (int) C89885b.GWS_READ_PELLET_PROTO_CONTENT_VALUE);
                        }
                    } else {
                        throw new C90457d(C89885b.GWS_READ_PELLET_PROTO_CONTENT_VALUE);
                    }
                }
                try {
                    if (this.f232378g == 6) {
                        messageLite = (C54196m) C62942bv.parseFrom((C62942bv) C54196m.f142231f, bArr2, C62921ba.m95368a());
                    } else {
                        messageLite = (C8523ac) C62942bv.parseFrom((C62942bv) C8523ac.f29564e, bArr2, C62921ba.m95368a());
                    }
                    C85945l lVar = new C85945l(BuildConfig.FLAVOR, false, messageLite, i3);
                    C8523ac a3 = lVar.mo79592a();
                    if (a3 != null) {
                        C62940bt r2 = C62942bv.checkIsLite(C8596w.f29745e);
                        a3.mo58887l(r2);
                        if (a3.f169962ag.mo58857o(r2.f169971d)) {
                            C62940bt r13 = C62942bv.checkIsLite(C8596w.f29745e);
                            a3.mo58887l(r13);
                            Object l = a3.f169962ag.mo58854l(r13.f169971d);
                            if (l == null) {
                                obj = r13.f169969b;
                            } else {
                                obj = r13.mo58889c(l);
                            }
                            C8596w wVar = (C8596w) obj;
                            throw new C90457d(wVar.f29748b + "(" + wVar.f29749c + ")", (int) C89885b.GWS_INTERNAL_SERVER_ERROR_VALUE);
                        }
                        int i5 = this.f232381j;
                        C62940bt r3 = C62942bv.checkIsLite(C8533am.f29593t);
                        a3.mo58887l(r3);
                        Object l2 = a3.f169962ag.mo58854l(r3.f169971d);
                        if (l2 == null) {
                            obj2 = r3.f169969b;
                        } else {
                            obj2 = r3.mo58889c(l2);
                        }
                        int d = i5 + ((C8533am) obj2).f29602h.mo59031d();
                        this.f232381j = d;
                        if (d > this.f232382k) {
                            throw new C90457d(C89885b.GWS_RESPONSE_SIZE_EXCEEDED_VALUE);
                        }
                    }
                    if (this.f232374c.mo17709a(lVar)) {
                        this.f232380i -= this.f232379h;
                        this.f232379h = -1;
                    } else {
                        throw new C90457d(C89885b.GWS_CHUNK_NOT_ACCEPTED_VALUE);
                    }
                } catch (C62974ct e4) {
                    throw new C90457d((Throwable) e4, (int) C89885b.GWS_BAD_PELLET_PROTO_CONTENT_VALUE);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public final C60870cx mo79586c() {
        this.f232377f.mo28211k(this.f232373b.mo27472b(), "PelletChunkAdapter first chunk", this);
        return this.f232376e;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C59081b.m91349a(C58979ad.FULL, "stack size");
        this.f232376e.mo57357o(th);
        m138136f(th);
    }

    /* renamed from: e */
    public final void mo17702gm(C89051g gVar) {
        try {
            int i = gVar.f241330b;
            if (i == 3) {
                if (this.f232380i != 0 && this.f232379h == -1) {
                    m138137g(true);
                }
                if (this.f232380i != 0) {
                    ((C59052c) ((C59052c) f232372a.mo56226d()).mo56372aa(8094)).mo56386p("Not all the bytes were parsed before EOF.");
                    int i2 = C90755l.f253831a;
                    throw new C90457d("Not all the bytes were parsed before EOF.", (int) C89885b.GWS_READ_PELLET_PROTO_CONTENT_VALUE);
                } else if (this.f232379h == -1) {
                    this.f232376e.mo57356n(C118826c.f331422a);
                    m138136f((Throwable) null);
                } else {
                    ((C59052c) ((C59052c) f232372a.mo56226d()).mo56372aa(8093)).mo56386p("Pellet was not completed before EOF.");
                    int i3 = C90755l.f253831a;
                    throw new C90457d("Pellet was not completed before EOF.", (int) C89885b.GWS_READ_PELLET_PROTO_CONTENT_VALUE);
                }
            } else if (i == 2) {
                mo17701gl(gVar.mo83023d());
            } else {
                this.f232380i += gVar.mo83020a();
                this.f232375d.add(gVar);
                m138137g(false);
                this.f232377f.mo28211k(this.f232373b.mo27472b(), "PelletChunkAdapter next chunk", this);
            }
        } catch (C90457d e) {
            mo17701gl(e);
        } catch (Error | RuntimeException e2) {
            mo17701gl(e2);
            throw e2;
        }
    }
}
