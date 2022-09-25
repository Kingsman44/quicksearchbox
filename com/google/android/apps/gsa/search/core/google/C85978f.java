package com.google.android.apps.gsa.search.core.google;

import android.text.TextUtils;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.C85662bm;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.search.core.preferences.C86341u;
import com.google.android.apps.gsa.search.core.preferences.C86346z;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.android.gms.clearcut.C143657j;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60690zf;
import com.google.common.p4552o.C60691zg;
import com.google.common.p4552o.C60692zh;
import com.google.common.p4552o.C60693zi;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.search.core.google.f */
/* compiled from: PG */
class C85978f implements C118549h {

    /* renamed from: a */
    C85885bh f232489a;

    /* renamed from: b */
    C86077s f232490b;

    /* renamed from: a */
    public final C60870cx mo65234a(C118476ak akVar) {
        C60693zi ziVar;
        String str = this.f232489a.f232214a.f232212b;
        C86077s sVar = this.f232490b;
        if (sVar.f232671d.mo79197l(C85662bm.DEVICE_APPS)) {
            if (TextUtils.isEmpty(sVar.f232673f.mo79659F())) {
                C58976aa aaVar = C58975e.f156826a;
                String str2 = sVar.f232670c.f232212b;
            } else {
                C58976aa aaVar2 = C58975e.f156826a;
                String str3 = sVar.f232670c.f232212b;
                C86077s sVar2 = this.f232490b;
                C85976e eVar = (C85976e) sVar2;
                List list = (List) eVar.f232674g.mo6453a();
                String str4 = eVar.f232670c.f232212b;
                String b = eVar.f232483a.mo79727b();
                String str5 = eVar.f232670c.f232212b;
                if (TextUtils.isEmpty(b)) {
                    ziVar = null;
                } else {
                    C60692zh zhVar = (C60692zh) C60693zi.f164669d.createBuilder();
                    zhVar.copyOnWrite();
                    C60693zi ziVar2 = (C60693zi) zhVar.instance;
                    b.getClass();
                    ziVar2.f164671a |= 1;
                    ziVar2.f164673c = b;
                    for (int i = 0; i < list.size(); i++) {
                        C86066h hVar = (C86066h) list.get(i);
                        C60690zf zfVar = (C60690zf) C60691zg.f164662f.createBuilder();
                        if (!TextUtils.isEmpty(hVar.f232649a)) {
                            String str6 = hVar.f232649a;
                            zfVar.copyOnWrite();
                            C60691zg zgVar = (C60691zg) zfVar.instance;
                            str6.getClass();
                            zgVar.f164664a |= 1;
                            zgVar.f164665b = str6;
                        }
                        String str7 = hVar.f232650b;
                        zfVar.copyOnWrite();
                        C60691zg zgVar2 = (C60691zg) zfVar.instance;
                        str7.getClass();
                        zgVar2.f164664a |= 2;
                        zgVar2.f164666c = str7;
                        long j = hVar.f232652d;
                        zfVar.copyOnWrite();
                        C60691zg zgVar3 = (C60691zg) zfVar.instance;
                        zgVar3.f164664a |= 4;
                        zgVar3.f164667d = j;
                        int i2 = hVar.f232651c;
                        zfVar.copyOnWrite();
                        C60691zg zgVar4 = (C60691zg) zfVar.instance;
                        zgVar4.f164664a |= 8;
                        zgVar4.f164668e = i2;
                        zhVar.copyOnWrite();
                        C60693zi ziVar3 = (C60693zi) zhVar.instance;
                        C60691zg zgVar5 = (C60691zg) zfVar.build();
                        zgVar5.getClass();
                        C62971cq cqVar = ziVar3.f164672b;
                        if (!cqVar.mo58948c()) {
                            ziVar3.f164672b = C62942bv.mutableCopy(cqVar);
                        }
                        ziVar3.f164672b.add(zgVar5);
                    }
                    ziVar = (C60693zi) zhVar.build();
                }
                if (ziVar != null) {
                    C86338r a = sVar2.f232672e.f232790a.mo79722a();
                    int i3 = a.getInt("ApplicationLoggerHash", 0);
                    int hashCode = Arrays.hashCode(ziVar.toByteArray());
                    C59052c cVar = (C59052c) C86077s.f232669b.mo56224b();
                    cVar.mo56378ag(C58975e.f156826a, sVar2.f232670c.f232212b);
                    ((C59052c) cVar.mo56372aa(7828)).mo56393w("logBytes() : Old Hash = %d : New Hash = %d", i3, hashCode);
                    try {
                        C143657j d = sVar2.f232675h.mo118999d(ziVar);
                        d.mo118996e(sVar2.f232673f.mo79659F());
                        d.f389473o = 1;
                        d.mo118992a();
                    } catch (SecurityException unused) {
                        ((C59052c) ((C59052c) C86077s.f232669b.mo56225c()).mo56372aa(7829)).mo56386p("SecurityException in logBytes().");
                    }
                    C86341u uVar = new C86341u((C86346z) a);
                    uVar.mo80085k("ApplicationLoggerHash", Integer.valueOf(hashCode));
                    uVar.mo80086l(false);
                }
                return C118826c.f331423b;
            }
        }
        return C118826c.f331423b;
    }
}
