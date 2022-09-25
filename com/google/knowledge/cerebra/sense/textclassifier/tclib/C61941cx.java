package com.google.knowledge.cerebra.sense.textclassifier.tclib;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.google.knowledge.cerebra.sense.textclassifier.p4680d.C61849a;
import com.google.knowledge.cerebra.sense.textclassifier.p4680d.C61850b;
import com.google.knowledge.cerebra.sense.textclassifier.p4680d.C61851c;
import com.google.knowledge.cerebra.sense.textclassifier.p4680d.C61852d;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import java.util.concurrent.Callable;

/* renamed from: com.google.knowledge.cerebra.sense.textclassifier.tclib.cx */
/* compiled from: PG */
public final /* synthetic */ class C61941cx implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C61897bg f167418a;

    public /* synthetic */ C61941cx(C61897bg bgVar) {
        this.f167418a = bgVar;
    }

    public final Object call() {
        C61897bg bgVar = this.f167418a;
        if (bgVar.f167368b) {
            Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
            intent.addCategory("android.intent.category.LAUNCHER");
            C61851c cVar = (C61851c) C61852d.f167143e.createBuilder();
            for (ResolveInfo next : bgVar.f167367a.getPackageManager().queryIntentActivities(intent, 0)) {
                C61849a aVar = (C61849a) C61850b.f167138d.createBuilder();
                String obj = next.loadLabel(bgVar.f167367a.getPackageManager()).toString();
                aVar.copyOnWrite();
                C61850b bVar = (C61850b) aVar.instance;
                obj.getClass();
                bVar.f167140a = 1 | bVar.f167140a;
                bVar.f167141b = obj;
                String str = next.activityInfo.applicationInfo.packageName;
                aVar.copyOnWrite();
                C61850b bVar2 = (C61850b) aVar.instance;
                str.getClass();
                bVar2.f167140a |= 2;
                bVar2.f167142c = str;
                cVar.copyOnWrite();
                C61852d dVar = (C61852d) cVar.instance;
                C61850b bVar3 = (C61850b) aVar.build();
                bVar3.getClass();
                C62971cq cqVar = dVar.f167146b;
                if (!cqVar.mo58948c()) {
                    dVar.f167146b = C62942bv.mutableCopy(cqVar);
                }
                dVar.f167146b.add(bVar3);
            }
            cVar.copyOnWrite();
            C61852d dVar2 = (C61852d) cVar.instance;
            dVar2.f167145a |= 1;
            dVar2.f167147c = 4;
            cVar.copyOnWrite();
            C61852d dVar3 = (C61852d) cVar.instance;
            dVar3.f167145a |= 2;
            dVar3.f167148d = 20;
            C61852d dVar4 = (C61852d) cVar.build();
            if (!dVar4.equals(bgVar.f167369c)) {
                bgVar.f167369c = dVar4;
                bgVar.f167370d = true;
            }
        }
        return null;
    }
}
