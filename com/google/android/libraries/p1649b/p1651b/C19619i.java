package com.google.android.libraries.p1649b.p1651b;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.libraries.p1649b.p1650a.C19606c;
import com.google.android.libraries.p1649b.p1650a.C19607d;
import com.google.android.libraries.p1649b.p1650a.C19609f;
import com.google.android.libraries.p1649b.p1650a.C19610g;
import com.google.android.libraries.p1649b.p1652c.C19622a;
import com.google.android.libraries.p1649b.p1653d.C19623a;
import com.google.android.libraries.p1649b.p1653d.C19624b;
import com.google.android.libraries.p1649b.p1653d.C19625c;
import com.google.android.libraries.p1649b.p1655f.C19628b;
import com.google.android.libraries.p1649b.p1655f.C19631e;
import com.google.common.p4522b.C58448fk;
import com.google.common.p4522b.C58784rw;
import com.google.common.p4522b.C58785rx;
import com.google.common.p4552o.p4566l.C60213m;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.common.util.concurrent.C60931s;
import com.google.protos.p4816ai.p4817a.C63188b;
import com.google.protos.p4816ai.p4817a.C63192f;
import java.util.Iterator;

/* renamed from: com.google.android.libraries.b.b.i */
/* compiled from: PG */
public final class C19619i extends C19611a {

    /* renamed from: b */
    private static final String f54593b = "i";

    /* renamed from: c */
    private final C19610g f54594c;

    /* renamed from: d */
    private final C19606c f54595d;

    /* renamed from: e */
    private C19622a f54596e;

    public C19619i(C19610g gVar, C19606c cVar) {
        super(gVar, 0, (Class) null);
        this.f54594c = gVar;
        this.f54595d = cVar;
    }

    /* renamed from: d */
    private static Rect m37446d(C19609f fVar, C19610g gVar) {
        int i = fVar.f54566c - gVar.f54571b;
        int i2 = fVar.f54567d;
        return new Rect(i2, i, fVar.f54564a + i2, fVar.f54565b + i);
    }

    /* renamed from: e */
    private final void m37447e(int i, int i2, boolean z, C19609f fVar) {
        if (this.f54577a.f54554a) {
            long currentTimeMillis = System.currentTimeMillis();
            if (i != 0 && i2 == 0) {
                i2 = 0;
                if (fVar != null) {
                    C63188b bVar = (C63188b) C19607d.m37427e(currentTimeMillis, 10).toBuilder();
                    bVar.copyOnWrite();
                    C63192f fVar2 = (C63192f) bVar.instance;
                    fVar2.f170701a |= 128;
                    fVar2.f170711k = i;
                    bVar.copyOnWrite();
                    C63192f fVar3 = (C63192f) bVar.instance;
                    fVar3.f170701a |= 64;
                    fVar3.f170710j = 0;
                    if (this.f54595d.mo24931d()) {
                        if (fVar.f54569f != -1) {
                            C60214n nVar = fVar.f54568e;
                            if ((nVar.f162916a & 2048) != 0) {
                                C60213m mVar = (C60213m) nVar.toBuilder();
                                mVar.copyOnWrite();
                                C60214n nVar2 = (C60214n) mVar.instance;
                                nVar2.f162921f = null;
                                nVar2.f162916a &= -2049;
                                bVar.copyOnWrite();
                                C63192f fVar4 = (C63192f) bVar.instance;
                                C60214n nVar3 = (C60214n) mVar.build();
                                nVar3.getClass();
                                fVar4.f170703c = nVar3;
                                fVar4.f170702b = 19;
                            }
                        }
                        C60214n nVar4 = fVar.f54568e;
                        bVar.copyOnWrite();
                        C63192f fVar5 = (C63192f) bVar.instance;
                        nVar4.getClass();
                        fVar5.f170703c = nVar4;
                        fVar5.f170702b = 19;
                    } else {
                        int i3 = fVar.f54568e.f162917b;
                        bVar.copyOnWrite();
                        C63192f fVar6 = (C63192f) bVar.instance;
                        fVar6.f170702b = 10;
                        fVar6.f170703c = Integer.valueOf(i3);
                    }
                    int i4 = fVar.f54569f;
                    if (i4 != -1) {
                        bVar.copyOnWrite();
                        C63192f fVar7 = (C63192f) bVar.instance;
                        fVar7.f170701a |= 8192;
                        fVar7.f170714n = i4;
                    }
                    this.f54577a.mo24936c((C63192f) bVar.build());
                    return;
                }
            }
            if (i != 0 || i2 != 0) {
                C63188b bVar2 = (C63188b) C19607d.m37427e(currentTimeMillis, 4).toBuilder();
                bVar2.copyOnWrite();
                C63192f fVar8 = (C63192f) bVar2.instance;
                fVar8.f170701a |= 128;
                fVar8.f170711k = i;
                bVar2.copyOnWrite();
                C63192f fVar9 = (C63192f) bVar2.instance;
                fVar9.f170701a |= 64;
                fVar9.f170710j = i2;
                bVar2.copyOnWrite();
                C63192f fVar10 = (C63192f) bVar2.instance;
                fVar10.f170701a |= C89885b.S3REQUEST_VALUE;
                fVar10.f170716p = z;
                this.f54577a.mo24936c((C63192f) bVar2.build());
            }
        }
    }

    /* renamed from: f */
    private final void m37448f(C58785rx rxVar, C58785rx rxVar2, C19610g gVar) {
        if (rxVar2 == null) {
            rxVar2 = C58448fk.m89722o();
        }
        C19622a aVar = this.f54596e;
        if (aVar != null) {
            aVar.f54602a.clear();
        }
        for (C58784rw rwVar : rxVar.mo55016g()) {
            int intValue = ((Integer) rwVar.mo55972b()).intValue();
            C19609f fVar = (C19609f) rwVar.mo55973c();
            C19609f fVar2 = (C19609f) rxVar2.mo55009a(Integer.valueOf(intValue), (C60214n) rwVar.mo55971a());
            if ((fVar2 == null && (!(fVar.f54564a == 0 && fVar.f54565b == 0) && m37446d(fVar, gVar).intersects(0, 0, gVar.f54572c, gVar.f54573d))) || (fVar2 != null && !fVar.equals(fVar2))) {
                long currentTimeMillis = System.currentTimeMillis();
                C19606c cVar = this.f54595d;
                C19621k.m37456c(fVar, currentTimeMillis, cVar.mo24931d(), this.f54577a, (C60931s) cVar.f54552b.get(fVar));
            }
            C19622a aVar2 = this.f54596e;
            if (aVar2 != null) {
                Rect d = m37446d(fVar, gVar);
                d.offset(0, -aVar2.f54604c);
                aVar2.f54602a.put(fVar, d);
            }
        }
        C19622a aVar3 = this.f54596e;
        if (aVar3 != null) {
            aVar3.invalidate();
        }
    }

    /* renamed from: a */
    public final void mo24947a(C19624b bVar, C19628b bVar2) {
        View view;
        C58448fk fkVar;
        boolean z;
        if (this.f54594c != null && this.f54577a != null) {
            C19623a aVar = (C19623a) bVar;
            int i = aVar.f54610a;
            if (i == 5 || i == 2) {
                view = (View) this.f54595d.f54553c.get();
            } else {
                if (i != 6) {
                    Log.e(f54593b, "Unsupported event type.");
                } else if (!(bVar2 instanceof C19631e)) {
                    Log.e(f54593b, "Invalid event data detected for event type VE_CONTAINER.");
                } else {
                    view = ((C19631e) bVar2).f54614b;
                }
                view = null;
            }
            if (view == null) {
                Log.e(f54593b, "Container view unknown, cannot process VEs.");
                return;
            }
            C19609f f = this.f54595d.mo24933f(view);
            int i2 = aVar.f54610a;
            int i3 = i2 - 1;
            boolean z2 = true;
            if (i3 == 1) {
                if (this.f54577a.f54554a) {
                    this.f54577a.mo24936c(C19607d.m37427e(System.currentTimeMillis(), 11));
                }
                this.f54594c.mo24943c();
                C58785rx g = this.f54595d.mo24934g(view, true);
                if (this.f54594c.mo24946f()) {
                    m37448f(g, (C58785rx) null, this.f54594c);
                }
            } else if (i3 != 4) {
                if (i3 != 5) {
                    Log.e(f54593b, "Received unsupported event: ".concat(C19625c.m37459a(i2)));
                } else if (!this.f54594c.mo24946f()) {
                    Log.w(f54593b, "Skip VE logging upon VE_CONTAINER event, because viewport is hidden.");
                } else if (bVar2 == null) {
                    Log.e(f54593b, "Received VE_CONTAINER event with null event data.");
                } else {
                    C19631e eVar = (C19631e) bVar2;
                    if (f == null) {
                        C58785rx rxVar = this.f54594c.f54575f;
                        fkVar = C58448fk.m89722o();
                        fkVar.mo55020j(rxVar);
                    } else {
                        C19610g gVar = this.f54594c;
                        int i4 = f.f54569f;
                        C60214n nVar = f.f54568e;
                        C58448fk o = C58448fk.m89722o();
                        gVar.mo24942b(i4, nVar, o);
                        fkVar = o;
                    }
                    Iterator it = this.f54595d.mo24934g(view, true).mo55016g().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = false;
                            break;
                        }
                        C58784rw rwVar = (C58784rw) it.next();
                        int intValue = ((Integer) rwVar.mo55972b()).intValue();
                        C19609f fVar = (C19609f) rwVar.mo55973c();
                        if (((C19609f) fkVar.mo55009a(Integer.valueOf(intValue), (C60214n) rwVar.mo55971a())) != null && fVar.f54564a != 0 && fVar.f54565b != 0) {
                            z = true;
                            break;
                        }
                    }
                    boolean z3 = eVar.f54615c;
                    int i5 = eVar.f54616d;
                    int i6 = eVar.f54617e;
                    if (!z3) {
                        m37447e(i5, i6, false, f);
                    } else {
                        int i7 = eVar.f54613a;
                        if (i7 == 0) {
                            z2 = false;
                        } else if (i7 != 1) {
                            this.f54594c.mo24943c();
                        } else {
                            if (z) {
                                this.f54594c.f54571b += i6;
                            } else {
                                this.f54594c.mo24943c();
                            }
                            z2 = !z;
                        }
                        m37447e(i5, i6, z2, f);
                    }
                    if (eVar.f54615c && (!z || eVar.f54613a == 2)) {
                        fkVar.mo55019i();
                    }
                    C58785rx g2 = this.f54595d.mo24934g(view, z);
                    if (!eVar.f54615c) {
                        for (C58784rw rwVar2 : fkVar.mo55016g()) {
                            C19609f fVar2 = (C19609f) rwVar2.mo55973c();
                            if (!(g2.mo55021k(rwVar2.mo55972b(), rwVar2.mo55971a()) || fVar2.f54564a == 0 || fVar2.f54565b == 0)) {
                                int i8 = fVar2.f54569f;
                                C60214n nVar2 = fVar2.f54568e;
                                g2.mo55010b(Integer.valueOf(i8), nVar2, new C19609f(0, 0, 0, 0, nVar2, i8));
                            }
                        }
                    }
                    m37448f(g2, fkVar, this.f54594c);
                }
            } else if (!this.f54594c.mo24946f()) {
                Log.w(f54593b, "Skip VE logging upon SHOW event, because viewport is hidden.");
            } else {
                m37448f(this.f54595d.mo24934g(view, true), (C58785rx) null, this.f54594c);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo24948b(C19628b bVar) {
    }

    /* renamed from: c */
    public final void mo24951c(C19622a aVar) {
        this.f54596e = aVar;
        if (aVar != null) {
            aVar.f54603b = this.f54594c;
        }
    }
}
