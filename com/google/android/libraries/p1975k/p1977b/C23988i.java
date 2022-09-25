package com.google.android.libraries.p1975k.p1977b;

import android.os.HandlerThread;
import android.provider.Settings;
import com.google.android.gms.libs.p10836d.p10839c.C144861c;
import com.google.android.libraries.p1975k.C23977a;
import com.google.android.libraries.p1975k.C23995c;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.protos.p4972d.p4983c.C64633b;

/* renamed from: com.google.android.libraries.k.b.i */
/* compiled from: PG */
public final class C23988i implements C23986g {

    /* renamed from: a */
    public static final C23988i f65583a = new C23988i();

    /* renamed from: b */
    private final C23987h[] f65584b;

    private C23988i() {
        int[] a = C64633b.m96410a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < 73) {
            int i4 = a[i2];
            int i5 = i4 - 1;
            if (i4 != 0) {
                i3 = Math.max(i3, i5);
                i2++;
            } else {
                throw null;
            }
        }
        this.f65584b = new C23987h[(i3 + 1)];
        int[] a2 = C64633b.m96410a();
        while (i < 73) {
            int i6 = a2[i];
            int i7 = i6 - 1;
            if (i6 != 0) {
                if (!(i7 == 17 || i7 == 27)) {
                    switch (i7) {
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                            break;
                        default:
                            switch (i7) {
                                case 19:
                                case 20:
                                case 21:
                                    break;
                                default:
                                    switch (i7) {
                                        case 31:
                                        case 32:
                                        case 33:
                                        case 34:
                                        case 35:
                                        case 36:
                                        case 37:
                                        case 38:
                                        case 39:
                                        case 40:
                                        case 41:
                                        case 42:
                                        case 43:
                                        case 44:
                                        case 45:
                                        case 46:
                                        case 47:
                                        case 48:
                                        case 49:
                                            break;
                                        default:
                                            switch (i7) {
                                                case 56:
                                                case 57:
                                                case 58:
                                                case 59:
                                                case 60:
                                                case 61:
                                                case 62:
                                                case 63:
                                                case 64:
                                                case 65:
                                                case 66:
                                                case 67:
                                                case 68:
                                                case 69:
                                                case 70:
                                                case 71:
                                                case 72:
                                                case 73:
                                                    break;
                                                default:
                                                    continue;
                                                    continue;
                                                    continue;
                                            }
                                    }
                            }
                    }
                }
                C23987h[] hVarArr = this.f65584b;
                C23987h hVar = new C23987h();
                hVarArr[i7] = hVar;
                hVar.f65582a = C58485gu.m89845m();
                i++;
            } else {
                throw null;
            }
        }
    }

    /* renamed from: a */
    public final C23985f mo29401a(int i, C23995c cVar) {
        C23984e eVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return C23981b.f65581a;
        }
        if (i2 == 1) {
            return C23980a.f65580a;
        }
        int i3 = 0;
        if (i2 == 2) {
            C23991l lVar = new C23991l(((C23977a) cVar).f65576a.getApplicationContext());
            if (C23993n.f65589a == null) {
                synchronized (C23993n.f65590b) {
                    if (C23993n.f65589a == null) {
                        C23993n nVar = new C23993n(((C23977a) cVar).f65576a.getApplicationContext(), lVar);
                        HandlerThread handlerThread = new HandlerThread("CheckboxObserverThread");
                        handlerThread.start();
                        nVar.f65591c.getContentResolver().registerContentObserver(Settings.Global.getUriFor("multi_cb"), false, new C23992m(nVar, new C144861c(handlerThread.getLooper())));
                        C23993n.f65589a = nVar;
                    }
                }
            }
            return C23993n.f65589a;
        } else if (i2 == 3) {
            return C23981b.f65581a;
        } else {
            if (i2 == 4) {
                return C23980a.f65580a;
            }
            if (i2 == 5) {
                return C23980a.f65580a;
            }
            if (i2 == 26) {
                return C23980a.f65580a;
            }
            switch (i2) {
                case 7:
                    return C23980a.f65580a;
                case 8:
                    return C23980a.f65580a;
                case 9:
                    return C23980a.f65580a;
                case 10:
                    return C23980a.f65580a;
                default:
                    switch (i2) {
                        case 22:
                            return C23980a.f65580a;
                        case 23:
                            return C23980a.f65580a;
                        case 24:
                            return C23980a.f65580a;
                        default:
                            C23987h hVar = this.f65584b[i2];
                            C23982c cVar2 = null;
                            if (hVar != null) {
                                C58485gu guVar = hVar.f65582a;
                                int i4 = ((C58724pq) guVar).f156474d;
                                while (true) {
                                    if (i3 < i4) {
                                        eVar = (C23984e) guVar.get(i3);
                                        C58833ax a = eVar.mo29400b().mo29398a();
                                        if (!a.mo56113h() || ((C58485gu) a.mo56107c()).isEmpty()) {
                                            cVar2 = eVar.mo29399a();
                                        } else {
                                            C58833ax axVar = ((C23977a) cVar).f65577b;
                                            i3++;
                                        }
                                    }
                                }
                                cVar2 = eVar.mo29399a();
                            }
                            return cVar2 != null ? cVar2 : C23981b.f65581a;
                    }
            }
        }
    }
}
