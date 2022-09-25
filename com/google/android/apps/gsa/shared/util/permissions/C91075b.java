package com.google.android.apps.gsa.shared.util.permissions;

import android.app.Activity;
import android.util.SparseArray;
import com.google.android.apps.gsa.p8852u.C118571d;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.util.p7184t.C91090a;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.C60627wx;
import com.google.common.p4552o.C60628wy;
import com.google.common.p4552o.C60629wz;
import com.google.common.p4552o.C60631xa;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;

/* renamed from: com.google.android.apps.gsa.shared.util.permissions.b */
/* compiled from: PG */
public final class C91075b implements C91079f {

    /* renamed from: a */
    final SparseArray f254351a = new SparseArray();

    /* renamed from: b */
    private final Activity f254352b;

    /* renamed from: c */
    private final C91090a f254353c;

    public C91075b(Activity activity, C91090a aVar) {
        this.f254352b = activity;
        this.f254353c = aVar;
    }

    /* renamed from: c */
    static void m148789c(Activity activity, int i, String[] strArr, int[] iArr) {
        C60627wx wxVar = (C60627wx) C60628wy.f164485f.createBuilder();
        wxVar.copyOnWrite();
        C60628wy wyVar = (C60628wy) wxVar.instance;
        wyVar.f164488b = i - 1;
        wyVar.f164487a |= 1;
        for (int i2 = 0; i2 < strArr.length; i2++) {
            C60629wz wzVar = (C60629wz) C60631xa.f164492d.createBuilder();
            C118571d a = C91077d.m148793a(strArr[i2]);
            wzVar.copyOnWrite();
            C60631xa xaVar = (C60631xa) wzVar.instance;
            xaVar.f164495b = a.f329810F;
            xaVar.f164494a |= 1;
            boolean z = iArr[i2] == 0;
            wzVar.copyOnWrite();
            C60631xa xaVar2 = (C60631xa) wzVar.instance;
            xaVar2.f164494a |= 2;
            xaVar2.f164496c = z;
            C60631xa xaVar3 = (C60631xa) wzVar.build();
            wxVar.copyOnWrite();
            C60628wy wyVar2 = (C60628wy) wxVar.instance;
            xaVar3.getClass();
            C62971cq cqVar = wyVar2.f164490d;
            if (!cqVar.mo58948c()) {
                wyVar2.f164490d = C62942bv.mutableCopy(cqVar);
            }
            wyVar2.f164490d.add(xaVar3);
        }
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 488;
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        ufVar2.f164093a |= 2;
        ufVar2.f164258m = 488;
        tzVar.copyOnWrite();
        C60555uf ufVar3 = (C60555uf) tzVar.instance;
        C60628wy wyVar3 = (C60628wy) wxVar.build();
        wyVar3.getClass();
        ufVar3.f164142aw = wyVar3;
        ufVar3.f164249d |= 4194304;
        C89949q.m146524i(activity, (C60555uf) tzVar.build(), false);
    }

    /* renamed from: b */
    public final void mo85347b(int i, String[] strArr, int[] iArr) {
        C91073a aVar;
        synchronized (this.f254351a) {
            aVar = (C91073a) this.f254351a.get(i);
            this.f254351a.delete(i);
        }
        if (aVar != null) {
            C91078e eVar = aVar.f254348a;
            if (eVar != null) {
                eVar.mo18206a(strArr, iArr);
            }
            m148789c(this.f254352b, aVar.f254349b, strArr, iArr);
        }
    }

    /* renamed from: ju */
    public final void mo81047ju(String[] strArr, int i, C91078e eVar) {
        int andIncrement = this.f254353c.f254381c.getAndIncrement();
        C91073a aVar = new C91073a(eVar, i);
        synchronized (this.f254351a) {
            this.f254351a.put(andIncrement, aVar);
        }
        this.f254352b.requestPermissions(strArr, andIncrement);
        C60627wx wxVar = (C60627wx) C60628wy.f164485f.createBuilder();
        wxVar.copyOnWrite();
        C60628wy wyVar = (C60628wy) wxVar.instance;
        wyVar.f164488b = i - 1;
        wyVar.f164487a |= 1;
        for (int i2 = 0; i2 < strArr.length; i2++) {
            C118571d a = C91077d.m148793a(strArr[i2]);
            wxVar.copyOnWrite();
            C60628wy wyVar2 = (C60628wy) wxVar.instance;
            a.getClass();
            C62961ch chVar = wyVar2.f164489c;
            if (!chVar.mo58948c()) {
                wyVar2.f164489c = C62942bv.mutableCopy(chVar);
            }
            wyVar2.f164489c.mo58916g(a.f329810F);
            if (a == C118571d.UNKNOWN_PERMISSION) {
                String str = strArr[i2];
                wxVar.copyOnWrite();
                C60628wy wyVar3 = (C60628wy) wxVar.instance;
                str.getClass();
                C62971cq cqVar = wyVar3.f164491e;
                if (!cqVar.mo58948c()) {
                    wyVar3.f164491e = C62942bv.mutableCopy(cqVar);
                }
                wyVar3.f164491e.add(str);
            }
        }
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 487;
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        C60628wy wyVar4 = (C60628wy) wxVar.build();
        wyVar4.getClass();
        ufVar2.f164142aw = wyVar4;
        ufVar2.f164249d |= 4194304;
        C89949q.m146524i(this.f254352b, (C60555uf) tzVar.build(), false);
    }
}
