package com.google.android.apps.gsa.staticplugins.p7385ak;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.provider.Telephony;
import androidx.core.content.p090a.C1846a;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.C90729am;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3897e.p3902c.p3907c.C51055es;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51060ex;
import com.google.assistant.p3897e.p3902c.p3907c.C51061ey;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;
import com.google.protos.p4874ap.p4875a.p4876a.C63662ac;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65761as;
import java.util.ArrayList;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.ak.r */
/* compiled from: PG */
public final /* synthetic */ class C93913r implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C93914s f262265a;

    public /* synthetic */ C93913r(C93914s sVar) {
        this.f262265a = sVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C93914s sVar = this.f262265a;
        C118826c cVar = (C118826c) obj;
        if (sVar.f262269f.a() == null) {
            return C118826c.f331423b;
        }
        sVar.f262274k.set(false);
        Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
        intent.addCategory("android.intent.category.LAUNCHER");
        PackageManager packageManager = sVar.f262268c.getPackageManager();
        C58480gp e = C58485gu.m89837e();
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        String defaultSmsPackage = Telephony.Sms.getDefaultSmsPackage(sVar.f262268c);
        C58528ij F = C58528ij.m90006F(sVar.f262275l.mo79745c(C90014bt.f247416gj));
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            ApplicationInfo applicationInfo = resolveInfo.activityInfo.applicationInfo;
            if (applicationInfo.enabled) {
                String str = applicationInfo.packageName;
                C51055es esVar = (C51055es) C51058ev.f132941o.createBuilder();
                esVar.copyOnWrite();
                C51058ev evVar = (C51058ev) esVar.instance;
                str.getClass();
                evVar.f132943a |= 1;
                evVar.f132944b = str;
                if (str.equals(defaultSmsPackage)) {
                    esVar.copyOnWrite();
                    C51058ev evVar2 = (C51058ev) esVar.instance;
                    evVar2.f132943a |= 4096;
                    evVar2.f132955m = true;
                }
                Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
                if (launchIntentForPackage != null) {
                    String uri = launchIntentForPackage.toUri(0);
                    esVar.copyOnWrite();
                    C51058ev evVar3 = (C51058ev) esVar.instance;
                    uri.getClass();
                    evVar3.f132943a |= 32;
                    evVar3.f132949g = uri;
                }
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
                    int i = packageInfo.versionCode;
                    esVar.copyOnWrite();
                    C51058ev evVar4 = (C51058ev) esVar.instance;
                    evVar4.f132943a |= 2;
                    evVar4.f132945c = i;
                    long a = C1846a.m5060a(packageInfo);
                    esVar.copyOnWrite();
                    C51058ev evVar5 = (C51058ev) esVar.instance;
                    evVar5.f132943a |= 4;
                    evVar5.f132946d = a;
                    if (F.contains(str)) {
                        String obj2 = packageManager.getApplicationLabel(packageInfo.applicationInfo).toString();
                        esVar.copyOnWrite();
                        C51058ev evVar6 = (C51058ev) esVar.instance;
                        obj2.getClass();
                        evVar6.f132943a |= 16;
                        evVar6.f132948f = obj2;
                    }
                    if (((C58759qy) C90729am.f253810a).f156534a.equals(str)) {
                        String str2 = packageInfo.versionName;
                        esVar.copyOnWrite();
                        C51058ev evVar7 = (C51058ev) esVar.instance;
                        str2.getClass();
                        evVar7.f132943a |= 8;
                        evVar7.f132947e = str2;
                    }
                    C51060ex exVar = (C51060ex) C51061ey.f132958e.createBuilder();
                    exVar.copyOnWrite();
                    C51061ey eyVar = (C51061ey) exVar.instance;
                    eyVar.f132962c = 1;
                    eyVar.f132960a |= 2;
                    exVar.copyOnWrite();
                    C51061ey eyVar2 = (C51061ey) exVar.instance;
                    C51058ev evVar8 = (C51058ev) esVar.build();
                    evVar8.getClass();
                    eyVar2.f132961b = evVar8;
                    eyVar2.f132960a |= 1;
                    C63042fg i2 = C62953e.m95484i(packageInfo.lastUpdateTime);
                    exVar.copyOnWrite();
                    C51061ey eyVar3 = (C51061ey) exVar.instance;
                    i2.getClass();
                    eyVar3.f132963d = i2;
                    eyVar3.f132960a |= 4;
                    e.mo55395g((C51061ey) exVar.build());
                } catch (PackageManager.NameNotFoundException e2) {
                    C59104x d = C93914s.f262266a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "DeviceAppInfoWork");
                    ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e2)).mo56372aa(19297)).mo56389s("failed to add [%s]", str);
                }
            }
        }
        C58485gu guVar = (C58485gu) Collection.EL.stream(e.mo55394f()).map(C93898c.f262243a).collect(C58370cn.f155946a);
        ArrayList arrayList = new ArrayList();
        for (String str3 : sVar.f262267b.mo79685s()) {
            arrayList.add(sVar.f262271h.mo28210j(sVar.f262270g.mo28209i(sVar.f262277n.a(str3, C65753ak.DEVICE_INSTALLED_APPS, (String) null, C63662ac.f172144a, C65761as.f178776d), "DeviceInstallApps dedup", C93895b.f262242a), "DeviceAppInfoWork#refreshDeviceAppInfoInternal", new C93912q(sVar, str3, guVar)));
        }
        return sVar.f262270g.mo28210j(C60856cj.m92906o(arrayList), "DeviceAppInfoWork#gellerWrite", new C93899d(sVar));
    }
}
