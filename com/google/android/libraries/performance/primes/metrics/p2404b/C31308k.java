package com.google.android.libraries.performance.primes.metrics.p2404b;

import android.text.TextUtils;
import com.google.android.libraries.directboot.C20674d;
import com.google.android.libraries.logging.p2185ve.p2193e.p2196c.C28407b;
import com.google.android.libraries.logging.p2185ve.p2193e.p2196c.C28408c;
import com.google.android.libraries.performance.primes.C31164au;
import com.google.android.libraries.performance.primes.p2397b.C31171a;
import com.google.android.libraries.performance.primes.p2397b.C31176f;
import com.google.android.libraries.performance.primes.p2397b.C31177g;
import com.google.android.libraries.performance.primes.p2397b.C31178h;
import com.google.android.libraries.performance.primes.p2397b.C31181k;
import com.google.android.libraries.performance.primes.p2402g.C31251n;
import com.google.android.libraries.performance.primes.p2402g.C31258u;
import com.google.android.libraries.performance.primes.transmitter.C31620l;
import com.google.common.base.C58833ax;
import com.google.common.base.C58881cr;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.p5271x.p5272a.p5273a.C67963a;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62964ck;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71206ap;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71207aq;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71268cx;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71269cy;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71270cz;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71273db;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71279dh;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71280di;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71281dj;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71282dk;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71301ec;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71304ef;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71307ei;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71308ej;

/* renamed from: com.google.android.libraries.performance.primes.metrics.b.k */
/* compiled from: PG */
public final /* synthetic */ class C31308k implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C31310m f84300a;

    /* renamed from: b */
    public final /* synthetic */ C31302e f84301b;

    public /* synthetic */ C31308k(C31310m mVar, C31302e eVar) {
        this.f84300a = mVar;
        this.f84301b = eVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C71304ef efVar;
        String str;
        ArrayList arrayList;
        C31171a[] aVarArr;
        int i;
        C31310m mVar = this.f84300a;
        C31302e eVar = this.f84301b;
        if (eVar.mo37016i()) {
            C71301ec ecVar = (C71301ec) C71304ef.f190405d.createBuilder();
            ecVar.copyOnWrite();
            C71304ef efVar2 = (C71304ef) ecVar.instance;
            efVar2.f190409c = 2;
            efVar2.f190407a |= 4;
            efVar = (C71304ef) ecVar.build();
        } else {
            Long c = eVar.mo37008c();
            C31251n nVar = mVar.f84305c;
            boolean z = nVar.f84185c;
            C31258u uVar = nVar.f84184b;
            if (z) {
                efVar = uVar.mo36974b(c);
            } else {
                efVar = uVar.mo36977d();
            }
        }
        if (efVar.f190408b == -1) {
            return C60866ct.f164955a;
        }
        C31315r rVar = (C31315r) mVar.f84304b.mo17428b();
        C71308ej g = eVar.mo37013g();
        C71307ei eiVar = (C71307ei) g.toBuilder();
        C71270cz czVar = (C71270cz) C71273db.f190293g.createBuilder();
        int i2 = rVar.f84333h;
        czVar.copyOnWrite();
        C71273db dbVar = (C71273db) czVar.instance;
        dbVar.f190298d = i2 - 1;
        dbVar.f190295a |= 4;
        String str2 = rVar.f84327b;
        if (str2 != null) {
            czVar.copyOnWrite();
            C71273db dbVar2 = (C71273db) czVar.instance;
            dbVar2.f190295a |= 1;
            dbVar2.f190296b = str2;
        }
        czVar.copyOnWrite();
        C71273db dbVar3 = (C71273db) czVar.instance;
        dbVar3.f190295a |= 8;
        dbVar3.f190299e = 474373037;
        String str3 = rVar.f84329d;
        if (str3 != null) {
            czVar.copyOnWrite();
            C71273db dbVar4 = (C71273db) czVar.instance;
            dbVar4.f190295a |= 2;
            dbVar4.f190297c = str3;
        }
        String str4 = rVar.f84328c;
        if (str4 != null) {
            czVar.copyOnWrite();
            C71273db dbVar5 = (C71273db) czVar.instance;
            dbVar5.f190295a |= 16;
            dbVar5.f190300f = str4;
        }
        eiVar.copyOnWrite();
        C71308ej ejVar = (C71308ej) eiVar.instance;
        C71273db dbVar6 = (C71273db) czVar.build();
        dbVar6.getClass();
        ejVar.f190434s = dbVar6;
        ejVar.f190416a |= 16777216;
        if (C20674d.m38856e(rVar.f84326a)) {
            C71281dj djVar = (C71281dj) C71282dk.f190324d.createBuilder();
            long freeSpace = rVar.f84330e.mo26886a().getFreeSpace();
            djVar.copyOnWrite();
            C71282dk dkVar = (C71282dk) djVar.instance;
            dkVar.f190326a |= 1;
            dkVar.f190327b = freeSpace / 1024;
            long longValue = ((Long) rVar.f84331f.mo6453a()).longValue();
            djVar.copyOnWrite();
            C71282dk dkVar2 = (C71282dk) djVar.instance;
            dkVar2.f190326a |= 2;
            dkVar2.f190328c = longValue;
            eiVar.copyOnWrite();
            C71308ej ejVar2 = (C71308ej) eiVar.instance;
            C71282dk dkVar3 = (C71282dk) djVar.build();
            dkVar3.getClass();
            ejVar2.f190436u = dkVar3;
            ejVar2.f190416a |= 67108864;
        }
        C58881cr crVar = rVar.f84332g;
        if (crVar == null) {
            str = null;
        } else {
            str = ((C31164au) crVar.mo6453a()).f84029a;
        }
        if (!TextUtils.isEmpty(str)) {
            C71269cy cyVar = g.f190438w;
            if (cyVar == null) {
                cyVar = C71269cy.f190288c;
            }
            C71268cx cxVar = (C71268cx) cyVar.toBuilder();
            if (((C71269cy) cxVar.instance).f190291b.isEmpty()) {
                cxVar.copyOnWrite();
                C71269cy cyVar2 = (C71269cy) cxVar.instance;
                str.getClass();
                cyVar2.f190290a |= 1;
                cyVar2.f190291b = str;
            } else {
                cxVar.copyOnWrite();
                C71269cy cyVar3 = (C71269cy) cxVar.instance;
                cyVar3.f190290a |= 1;
                cyVar3.f190291b = str + "::" + ((C71269cy) cxVar.instance).f190291b;
            }
            eiVar.copyOnWrite();
            C71308ej ejVar3 = (C71308ej) eiVar.instance;
            C71269cy cyVar4 = (C71269cy) cxVar.build();
            cyVar4.getClass();
            ejVar3.f190438w = cyVar4;
            ejVar3.f190416a |= 268435456;
        }
        C71307ei eiVar2 = (C71307ei) ((C71308ej) eiVar.build()).toBuilder();
        eiVar2.copyOnWrite();
        C71308ej ejVar4 = (C71308ej) eiVar2.instance;
        efVar.getClass();
        ejVar4.f190431p = efVar;
        ejVar4.f190416a |= 4194304;
        C31178h b = eVar.mo37007b();
        int i3 = 0;
        if (b != null && mVar.f84307e.mo56113h()) {
            int a = eVar.mo37006a();
            ArrayList arrayList2 = new ArrayList();
            int i4 = 0;
            while (true) {
                C31181k[] kVarArr = b.f84047b;
                if (i4 >= kVarArr.length) {
                    break;
                }
                C31181k kVar = kVarArr[i4];
                int i5 = b.f84048c[i4];
                if (a <= 0) {
                    aVarArr = new C31171a[i3];
                } else {
                    int max = Math.max(i5 - Math.min(a, 19), i3);
                    int i6 = i5 - max;
                    if (i6 <= 0) {
                        aVarArr = new C31171a[i3];
                    } else {
                        C31171a[] aVarArr2 = new C31171a[i6];
                        for (int i7 = 0; i7 < i6; i7++) {
                            aVarArr2[i7] = (C31171a) kVar.f84052a.get((i7 + max) % 20);
                        }
                        int i8 = kVar.f84054c;
                        if (i8 >= i5) {
                            i = i8 - i5;
                        } else {
                            int i9 = kVar.f84055d;
                            i = (i8 - 27) + (Integer.MAX_VALUE - i5);
                        }
                        int i10 = (i - (20 - i6)) + 1;
                        if (i10 >= i6) {
                            aVarArr = new C31171a[0];
                        } else if (i10 > 0) {
                            int i11 = i6 - i10;
                            aVarArr = new C31171a[i11];
                            System.arraycopy(aVarArr2, i10, aVarArr, 0, i11);
                        } else {
                            aVarArr = aVarArr2;
                        }
                    }
                }
                for (C31171a gVar : aVarArr) {
                    arrayList2.add(new C31177g(gVar, i4));
                }
                i4++;
                i3 = 0;
            }
            Collections.sort(arrayList2, C31176f.f84043a);
            C71279dh dhVar = (C71279dh) C71280di.f190319d.createBuilder();
            long j = 0;
            for (int max2 = Math.max(arrayList2.size() - a, 0); max2 < arrayList2.size(); max2++) {
                C31177g gVar2 = (C31177g) arrayList2.get(max2);
                C31171a aVar = gVar2.f84044a;
                int i12 = gVar2.f84045b;
                Long a2 = C67963a.m98221a(aVar.f84038b + "." + aVar.f84039c + ":" + aVar.f84040d);
                if (a2 != null) {
                    long longValue2 = a2.longValue();
                    dhVar.copyOnWrite();
                    C71280di diVar = (C71280di) dhVar.instance;
                    C62964ck ckVar = diVar.f190321a;
                    if (!ckVar.mo58948c()) {
                        diVar.f190321a = C62942bv.mutableCopy(ckVar);
                    }
                    diVar.f190321a.mo58929f(longValue2);
                    long j2 = aVar.f84037a / 1000000;
                    long j3 = j2 - j;
                    dhVar.copyOnWrite();
                    C71280di diVar2 = (C71280di) dhVar.instance;
                    C62964ck ckVar2 = diVar2.f190322b;
                    if (!ckVar2.mo58948c()) {
                        diVar2.f190322b = C62942bv.mutableCopy(ckVar2);
                    }
                    diVar2.f190322b.mo58929f(j3);
                    dhVar.copyOnWrite();
                    C71280di diVar3 = (C71280di) dhVar.instance;
                    C62961ch chVar = diVar3.f190323c;
                    if (!chVar.mo58948c()) {
                        diVar3.f190323c = C62942bv.mutableCopy(chVar);
                    }
                    diVar3.f190323c.mo58916g(i12);
                    j = j2;
                }
            }
            C71280di diVar4 = (C71280di) dhVar.build();
            eiVar2.copyOnWrite();
            C71308ej ejVar5 = (C71308ej) eiVar2.instance;
            diVar4.getClass();
            ejVar5.f190432q = diVar4;
            ejVar5.f190416a |= 8388608;
        }
        C58833ax axVar = mVar.f84308f;
        if (axVar.mo56113h()) {
            C28407b bVar = ((C28408c) axVar.mo56107c()).f77175a;
            synchronized (bVar.f77174a) {
                arrayList = new ArrayList(bVar.f77174a);
            }
            List g2 = C58597ky.m90216g(arrayList);
            C58485gu j4 = C58485gu.m89842j(g2.subList(0, Math.min(3, g2.size())));
            eiVar2.copyOnWrite();
            C71308ej ejVar6 = (C71308ej) eiVar2.instance;
            C62971cq cqVar = ejVar6.f190433r;
            if (!cqVar.mo58948c()) {
                ejVar6.f190433r = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll((Iterable) j4, (List) ejVar6.f190433r);
        }
        String e = eVar.mo37010e();
        if (eVar.mo37014h()) {
            if (e != null) {
                eiVar2.copyOnWrite();
                C71308ej ejVar7 = (C71308ej) eiVar2.instance;
                ejVar7.f190416a |= 4;
                ejVar7.f190419d = e;
            } else {
                eiVar2.copyOnWrite();
                C71308ej ejVar8 = (C71308ej) eiVar2.instance;
                ejVar8.f190416a &= -5;
                ejVar8.f190419d = C71308ej.f190415x.f190419d;
            }
        } else if (e != null) {
            eiVar2.copyOnWrite();
            C71308ej ejVar9 = (C71308ej) eiVar2.instance;
            ejVar9.f190416a |= 2;
            ejVar9.f190418c = e;
        } else {
            eiVar2.copyOnWrite();
            C71308ej ejVar10 = (C71308ej) eiVar2.instance;
            ejVar10.f190416a &= -3;
            ejVar10.f190418c = C71308ej.f190415x.f190418c;
        }
        C71207aq c2 = C31310m.m58378c(((C31309l) mVar.f84306d).f84302a);
        C71207aq f = eVar.mo37012f();
        if (!(c2 == null && f == null)) {
            if (c2 != null && f != null) {
                C71206ap apVar = (C71206ap) c2.toBuilder();
                apVar.mergeFrom(f);
                c2 = (C71207aq) apVar.build();
            } else if (c2 == null) {
                c2 = f;
            }
            eiVar2.copyOnWrite();
            C71308ej ejVar11 = (C71308ej) eiVar2.instance;
            c2.getClass();
            ejVar11.f190437v = c2;
            ejVar11.f190416a |= 134217728;
        }
        String d = eVar.mo37009d();
        if (d != null) {
            C71268cx cxVar2 = (C71268cx) C71269cy.f190288c.createBuilder();
            cxVar2.copyOnWrite();
            C71269cy cyVar5 = (C71269cy) cxVar2.instance;
            cyVar5.f190290a |= 1;
            cyVar5.f190291b = d;
            eiVar2.copyOnWrite();
            C71308ej ejVar12 = (C71308ej) eiVar2.instance;
            C71269cy cyVar6 = (C71269cy) cxVar2.build();
            cyVar6.getClass();
            ejVar12.f190438w = cyVar6;
            ejVar12.f190416a |= 268435456;
        }
        C31306i iVar = mVar.f84303a;
        C71308ej ejVar13 = (C71308ej) eiVar2.build();
        C58485gu guVar = (C58485gu) iVar.f84298b.mo6453a();
        C58480gp f2 = C58485gu.m89838f(guVar.size());
        int size = guVar.size();
        RuntimeException runtimeException = null;
        for (int i13 = 0; i13 < size; i13++) {
            try {
                f2.mo55395g(((C31620l) guVar.get(i13)).mo37277b(ejVar13));
            } catch (RuntimeException e2) {
                ((C59052c) ((C59052c) ((C59052c) C31306i.f84297a.mo56226d()).mo56382g(e2)).mo56372aa(50365)).mo56386p("One transmitter failed to send message");
                if (runtimeException == null) {
                    runtimeException = e2;
                } else {
                    try {
                        Class[] clsArr = new Class[1];
                        try {
                            clsArr[0] = Throwable.class;
                            try {
                                Throwable.class.getDeclaredMethod("addSuppressed", clsArr).invoke(runtimeException, new Object[]{e2});
                            } catch (Exception unused) {
                            }
                        } catch (Exception unused2) {
                        }
                    } catch (Exception unused3) {
                    }
                }
            }
        }
        if (runtimeException == null) {
            C60870cx a3 = C60856cj.m92894c(f2.mo55394f()).mo57334a(C31304g.f84295a, C60826bg.f164896a);
            mVar.f84305c.f84186d.mo36967b();
            return a3;
        }
        throw runtimeException;
    }
}
