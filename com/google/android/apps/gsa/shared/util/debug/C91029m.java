package com.google.android.apps.gsa.shared.util.debug;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C59795fw;
import com.google.common.p4552o.C59796fx;
import com.google.common.p4552o.C59797fy;
import com.google.common.p4552o.C59798fz;
import com.google.common.p4552o.C59818gk;
import com.google.common.p4552o.C59822go;
import com.google.common.p4552o.C59824gq;
import com.google.common.p4552o.C59825gr;
import com.google.common.p4552o.C59855hs;
import com.google.common.p4552o.C59856ht;
import com.google.common.p4552o.C59857hu;
import com.google.common.p4552o.C59858hv;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.shared.util.debug.m */
/* compiled from: PG */
public final class C91029m implements C90991b {

    /* renamed from: a */
    private final Context f254267a;

    public C91029m(Context context) {
        this.f254267a = context;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        C59856ht htVar;
        try {
            C59857hu huVar = (C59857hu) C59858hv.f161763g.createBuilder();
            C59797fy fyVar = (C59797fy) C59798fz.f161600i.createBuilder();
            String str = Build.DEVICE;
            fyVar.copyOnWrite();
            C59798fz fzVar = (C59798fz) fyVar.instance;
            str.getClass();
            fzVar.f161602a |= 1;
            fzVar.f161603b = str;
            String str2 = Build.ID;
            fyVar.copyOnWrite();
            C59798fz fzVar2 = (C59798fz) fyVar.instance;
            str2.getClass();
            fzVar2.f161602a |= 4;
            fzVar2.f161605d = str2;
            String str3 = Build.VERSION.RELEASE;
            fyVar.copyOnWrite();
            C59798fz fzVar3 = (C59798fz) fyVar.instance;
            str3.getClass();
            fzVar3.f161602a |= 2;
            fzVar3.f161604c = str3;
            String str4 = Build.MODEL;
            fyVar.copyOnWrite();
            C59798fz fzVar4 = (C59798fz) fyVar.instance;
            str4.getClass();
            fzVar4.f161602a |= 8;
            fzVar4.f161606e = str4;
            List asList = Arrays.asList(Build.SUPPORTED_ABIS);
            fyVar.copyOnWrite();
            C59798fz fzVar5 = (C59798fz) fyVar.instance;
            C62971cq cqVar = fzVar5.f161607f;
            if (!cqVar.mo58948c()) {
                fzVar5.f161607f = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll((Iterable) asList, (List) fzVar5.f161607f);
            String str5 = Build.TAGS;
            fyVar.copyOnWrite();
            C59798fz fzVar6 = (C59798fz) fyVar.instance;
            str5.getClass();
            fzVar6.f161602a |= 16;
            fzVar6.f161608g = str5;
            String str6 = Build.TYPE;
            fyVar.copyOnWrite();
            C59798fz fzVar7 = (C59798fz) fyVar.instance;
            str6.getClass();
            fzVar7.f161602a |= 32;
            fzVar7.f161609h = str6;
            C59798fz fzVar8 = (C59798fz) fyVar.build();
            huVar.copyOnWrite();
            C59858hv hvVar = (C59858hv) huVar.instance;
            fzVar8.getClass();
            hvVar.f161768d = fzVar8;
            hvVar.f161765a |= 4;
            TelephonyManager telephonyManager = (TelephonyManager) this.f254267a.getSystemService("phone");
            C59818gk gkVar = (C59818gk) C59825gr.f161654e.createBuilder();
            int a = C59822go.m92512a(telephonyManager.getDataActivity());
            if (a != 0) {
                gkVar.copyOnWrite();
                C59825gr grVar = (C59825gr) gkVar.instance;
                grVar.f161658c = a - 1;
                grVar.f161656a |= 2;
            }
            int a2 = C59824gq.m92513a(telephonyManager.getDataState());
            if (a2 != 0) {
                gkVar.copyOnWrite();
                C59825gr grVar2 = (C59825gr) gkVar.instance;
                grVar2.f161659d = a2 - 1;
                grVar2.f161656a |= 4;
            }
            C59825gr grVar3 = (C59825gr) gkVar.build();
            huVar.copyOnWrite();
            C59858hv hvVar2 = (C59858hv) huVar.instance;
            grVar3.getClass();
            hvVar2.f161770f = grVar3;
            hvVar2.f161765a |= 16;
            C59855hs hsVar = (C59855hs) C59856ht.f161758d.createBuilder();
            try {
                PackageInfo packageInfo = this.f254267a.getPackageManager().getPackageInfo("com.google.android.gms", 0);
                String str7 = packageInfo.packageName;
                hsVar.copyOnWrite();
                C59856ht htVar2 = (C59856ht) hsVar.instance;
                str7.getClass();
                htVar2.f161760a |= 1;
                htVar2.f161761b = str7;
                String str8 = packageInfo.versionName;
                hsVar.copyOnWrite();
                C59856ht htVar3 = (C59856ht) hsVar.instance;
                str8.getClass();
                htVar3.f161760a |= 2;
                htVar3.f161762c = str8;
                htVar = (C59856ht) hsVar.build();
            } catch (PackageManager.NameNotFoundException unused) {
                htVar = null;
            }
            if (htVar != null) {
                huVar.copyOnWrite();
                C59858hv hvVar3 = (C59858hv) huVar.instance;
                hvVar3.f161766b = htVar;
                hvVar3.f161765a |= 1;
            }
            C59795fw fwVar = fVar.f254236a;
            fwVar.copyOnWrite();
            C59796fx fxVar = (C59796fx) fwVar.instance;
            C59858hv hvVar4 = (C59858hv) huVar.build();
            C59796fx fxVar2 = C59796fx.f161580r;
            hvVar4.getClass();
            fxVar.f161584c = hvVar4;
            fxVar.f161582a |= 2;
            fVar.mo85291r("Display Info");
            if (Build.VERSION.SDK_INT < 31 || this.f254267a.isUiContext()) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                ((WindowManager) this.f254267a.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
                HashMap hashMap = new HashMap();
                for (Field field : DisplayMetrics.class.getFields()) {
                    try {
                        hashMap.put(field.getName(), String.valueOf(field.get(displayMetrics)));
                    } catch (IllegalAccessException unused2) {
                    }
                }
                fVar.mo85292s(C90752i.m148229c(hashMap.toString()));
            } else {
                fVar.mo85292s(C90752i.m148229c("dumpDisplayInfo aborted - not a UI Context!"));
            }
            fVar.mo85291r("Battery Info");
            Intent registerReceiver = this.f254267a.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver == null) {
                fVar.mo85292s(C90752i.m148229c("Not Supported"));
                return;
            }
            HashMap hashMap2 = new HashMap();
            Bundle extras = registerReceiver.getExtras();
            for (Field field2 : BatteryManager.class.getFields()) {
                field2.setAccessible(true);
                String name = field2.getName();
                if (field2.getType() == String.class) {
                    try {
                        hashMap2.put(name, String.valueOf(extras.get((String) field2.get((Object) null))));
                    } catch (Exception unused3) {
                    }
                }
            }
            fVar.mo85292s(C90752i.m148229c(hashMap2.toString()));
        } catch (Exception unused4) {
            C58976aa aaVar = C58975e.f156826a;
            fVar.mo85292s(C90752i.m148229c("Unavailable"));
        }
    }
}
