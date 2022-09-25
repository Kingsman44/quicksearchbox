package com.google.android.gms.cast.framework.p10772a.p10773a;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.common.p4552o.p4557d.p4558a.C59715c;
import com.google.common.p4552o.p4566l.C60108a;
import com.google.common.p4552o.p4566l.C60135b;
import com.google.common.p4552o.p4566l.C60162c;
import com.google.common.p4552o.p4566l.C60189d;
import com.google.common.p4552o.p4566l.C60207g;
import com.google.common.p4552o.p4566l.C60208h;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.cast.framework.a.a.h */
/* compiled from: PG */
public final /* synthetic */ class C143389h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C143390i f388878a;

    public /* synthetic */ C143389h(C143390i iVar) {
        this.f388878a = iVar;
    }

    public final void run() {
        C143390i iVar = this.f388878a;
        if (!iVar.f388887h.isEmpty()) {
            long j = true != iVar.f388888i.equals(iVar.f388887h) ? 86400000 : 172800000;
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = iVar.f388889j;
            if (j2 == 0 || currentTimeMillis - j2 >= j) {
                C143390i.f388879a.mo118884b("Upload the feature usage report.", new Object[0]);
                C60162c cVar = (C60162c) C60189d.f162816d.createBuilder();
                String str = C143390i.f388880b;
                cVar.copyOnWrite();
                C60189d dVar = (C60189d) cVar.instance;
                str.getClass();
                dVar.f162818a |= 2;
                dVar.f162820c = str;
                String str2 = iVar.f388884e;
                cVar.copyOnWrite();
                C60189d dVar2 = (C60189d) cVar.instance;
                str2.getClass();
                dVar2.f162818a |= 1;
                dVar2.f162819b = str2;
                C60189d dVar3 = (C60189d) cVar.build();
                ArrayList<C59715c> arrayList = new ArrayList<>();
                arrayList.addAll(iVar.f388887h);
                C60108a aVar = (C60108a) C60135b.f162669d.createBuilder();
                aVar.copyOnWrite();
                C60135b bVar = (C60135b) aVar.instance;
                C62961ch chVar = bVar.f162673c;
                if (!chVar.mo58948c()) {
                    bVar.f162673c = C62942bv.mutableCopy(chVar);
                }
                for (C59715c cVar2 : arrayList) {
                    bVar.f162673c.mo58916g(cVar2.f160290ac);
                }
                aVar.copyOnWrite();
                C60135b bVar2 = (C60135b) aVar.instance;
                dVar3.getClass();
                bVar2.f162672b = dVar3;
                bVar2.f162671a |= 1;
                C60135b bVar3 = (C60135b) aVar.build();
                C60207g gVar = (C60207g) C60208h.f162890l.createBuilder();
                gVar.copyOnWrite();
                C60208h hVar = (C60208h) gVar.instance;
                bVar3.getClass();
                hVar.f162902k = bVar3;
                hVar.f162893b |= 512;
                iVar.f388882c.mo118567a((C60208h) gVar.build(), 243);
                SharedPreferences.Editor edit = iVar.f388883d.edit();
                if (!iVar.f388888i.equals(iVar.f388887h)) {
                    iVar.f388888i.clear();
                    iVar.f388888i.addAll(iVar.f388887h);
                    for (C59715c cVar3 : iVar.f388888i) {
                        String num = Integer.toString(cVar3.f160290ac);
                        String d = iVar.mo118564d(num);
                        String c = C143390i.m232668c("feature_usage_timestamp_reported_feature_", num);
                        if (!TextUtils.equals(d, c)) {
                            long j3 = iVar.f388883d.getLong(d, 0);
                            edit.remove(d);
                            if (j3 != 0) {
                                edit.putLong(c, j3);
                            }
                        }
                    }
                }
                iVar.f388889j = currentTimeMillis;
                edit.putLong("feature_usage_last_report_time", currentTimeMillis).apply();
            }
        }
    }
}
