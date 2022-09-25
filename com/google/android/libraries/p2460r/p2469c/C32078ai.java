package com.google.android.libraries.p2460r.p2469c;

import android.content.Context;
import com.google.android.libraries.p2460r.p2464b.p2465a.C32053c;
import com.google.android.libraries.p2460r.p2464b.p2466b.C32054a;
import com.google.android.libraries.p2460r.p2464b.p2468d.C32056a;
import com.google.android.libraries.p2460r.p2469c.p2470a.C32059b;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57404cb;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57420cr;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57423cu;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57424cv;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57426cx;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57428cz;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57430da;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57433dd;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57434de;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.libraries.r.c.ai */
/* compiled from: PG */
public final class C32078ai {

    /* renamed from: a */
    private final int f86131a;

    /* renamed from: b */
    private final int f86132b;

    /* renamed from: c */
    private final boolean f86133c;

    /* renamed from: d */
    private final Context f86134d;

    public C32078ai(int i, C32059b bVar, Context context) {
        this.f86131a = i;
        this.f86132b = context.getResources().getConfiguration().orientation;
        this.f86133c = ((Boolean) ((C32053c) bVar.f86112c).f86109a).booleanValue();
        this.f86134d = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo37859a(List list) {
        C57426cx cxVar;
        C57426cx cxVar2;
        C57426cx cxVar3;
        C57434de deVar;
        C57424cv cvVar;
        Iterator it = list.iterator();
        while (true) {
            int i = 1;
            if (!it.hasNext()) {
                return true;
            }
            C57430da daVar = (C57430da) it.next();
            int i2 = daVar.f153408a;
            int a = C57428cz.m88351a(i2);
            int i3 = a - 1;
            if (a != 0) {
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            if (i2 == 3) {
                                cvVar = (C57424cv) daVar.f153409b;
                            } else {
                                cvVar = C57424cv.f153396b;
                            }
                            int a2 = C57423cu.m88350a(cvVar.f153398a);
                            if (a2 != 0) {
                                i = a2;
                            }
                            int i4 = i - 1;
                            if (i4 == 0) {
                                C32054a.m59731b(5, "MediaQueryHelper", (Throwable) null, "Got UNSPECIFIED DarkLightMode; defaulting to LIGHT", new Object[0]);
                            } else if (i4 == 2) {
                                if (!this.f86133c) {
                                    break;
                                }
                            }
                            if (this.f86133c) {
                                break;
                            }
                        } else {
                            C57404cb cbVar = C57404cb.ERR_INVALID_MEDIA_QUERY_CONDITION;
                            Object[] objArr = new Object[1];
                            int a3 = C57428cz.m88351a(daVar.f153408a);
                            objArr[0] = a3 != 1 ? a3 != 2 ? a3 != 3 ? a3 != 4 ? "null" : "CONDITION_NOT_SET" : "DARK_LIGHT" : "ORIENTATION" : "FRAME_WIDTH";
                            throw new C32083an(cbVar, String.format("Unhandled MediaQueryCondition: %s", objArr));
                        }
                    } else {
                        if (i2 == 2) {
                            deVar = (C57434de) daVar.f153409b;
                        } else {
                            deVar = C57434de.f153411b;
                        }
                        int a4 = C57433dd.m88352a(deVar.f153413a);
                        if (a4 == 0) {
                            a4 = 1;
                        }
                        int i5 = a4 - 1;
                        if (i5 != 0) {
                            if (i5 == 2) {
                                if (this.f86132b != 2) {
                                    break;
                                }
                            }
                        } else {
                            C32054a.m59731b(5, "MediaQueryHelper", (Throwable) null, "Got UNSPECIFIED orientation; defaulting to PORTRAIT", new Object[0]);
                        }
                        int i6 = this.f86132b;
                        if (!(i6 == 1 || i6 == 3)) {
                            break;
                        }
                    }
                } else {
                    if (i2 == 1) {
                        cxVar = (C57426cx) daVar.f153409b;
                    } else {
                        cxVar = C57426cx.f153400c;
                    }
                    int a5 = (int) C32056a.m59733a((float) cxVar.f153402a, this.f86134d);
                    if (daVar.f153408a == 1) {
                        cxVar2 = (C57426cx) daVar.f153409b;
                    } else {
                        cxVar2 = C57426cx.f153400c;
                    }
                    int a6 = C57420cr.m88349a(cxVar2.f153403b);
                    if (a6 == 0) {
                        a6 = 1;
                    }
                    int i7 = a6 - 1;
                    if (i7 == 1) {
                        if (this.f86131a != a5) {
                            break;
                        }
                    } else if (i7 != 2) {
                        if (i7 == 3) {
                            if (this.f86131a >= a5) {
                                break;
                            }
                        } else if (i7 == 4) {
                            if (this.f86131a <= a5) {
                                break;
                            }
                        } else {
                            C57404cb cbVar2 = C57404cb.ERR_INVALID_MEDIA_QUERY_CONDITION;
                            Object[] objArr2 = new Object[1];
                            if (daVar.f153408a == 1) {
                                cxVar3 = (C57426cx) daVar.f153409b;
                            } else {
                                cxVar3 = C57426cx.f153400c;
                            }
                            int a7 = C57420cr.m88349a(cxVar3.f153403b);
                            objArr2[0] = (a7 == 0 || a7 == 1) ? "UNSPECIFIED" : a7 != 2 ? a7 != 3 ? a7 != 4 ? "GREATER_THAN" : "LESS_THAN" : "NOT_EQUALS" : "EQUALS";
                            throw new C32083an(cbVar2, String.format("Unhandled ComparisonCondition: %s", objArr2));
                        }
                    } else if (this.f86131a == a5) {
                        break;
                    }
                }
            } else {
                throw null;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32078ai)) {
            return false;
        }
        C32078ai aiVar = (C32078ai) obj;
        return this.f86131a == aiVar.f86131a && this.f86132b == aiVar.f86132b && this.f86133c == aiVar.f86133c && this.f86134d.equals(aiVar.f86134d);
    }

    public final int hashCode() {
        return (((((this.f86131a * 31) + this.f86132b) * 31) + (this.f86133c ? 1 : 0)) * 31) + this.f86134d.hashCode();
    }
}
