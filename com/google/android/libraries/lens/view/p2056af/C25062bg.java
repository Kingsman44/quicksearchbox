package com.google.android.libraries.lens.view.p2056af;

import android.app.ActivityManager;
import android.os.BatteryManager;
import android.os.PowerManager;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4552o.acx;
import com.google.common.p4552o.acy;
import com.google.common.p4552o.acz;
import com.google.common.p4552o.ada;
import com.google.common.p4552o.adb;
import com.google.common.p4552o.adc;
import com.google.common.p4552o.add;
import com.google.common.p4552o.ade;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import java.io.File;
import java.util.concurrent.Callable;
import p3186j$.util.DesugarArrays;

/* renamed from: com.google.android.libraries.lens.view.af.bg */
/* compiled from: PG */
public final /* synthetic */ class C25062bg implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C25068bm f68307a;

    public /* synthetic */ C25062bg(C25068bm bmVar) {
        this.f68307a = bmVar;
    }

    public final Object call() {
        C25068bm bmVar = this.f68307a;
        BatteryManager batteryManager = (BatteryManager) bmVar.f68316b.getSystemService("batterymanager");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) bmVar.f68316b.getSystemService("activity")).getMemoryInfo(memoryInfo);
        adc adc = (adc) add.f158348e.createBuilder();
        long j = memoryInfo.totalMem;
        adc.copyOnWrite();
        add add = (add) adc.instance;
        add.f158350a |= 1;
        add.f158351b = j / 1000;
        long j2 = memoryInfo.availMem;
        adc.copyOnWrite();
        add add2 = (add) adc.instance;
        add2.f158350a |= 2;
        add2.f158352c = j2 / 1000;
        boolean z = memoryInfo.lowMemory;
        adc.copyOnWrite();
        add add3 = (add) adc.instance;
        add3.f158350a |= 4;
        add3.f158353d = z;
        acx acx = (acx) acy.f158337e.createBuilder();
        int intProperty = batteryManager.getIntProperty(4);
        acx.copyOnWrite();
        acy acy = (acy) acx.instance;
        acy.f158339a |= 1;
        acy.f158340b = intProperty;
        boolean isPowerSaveMode = ((PowerManager) bmVar.f68316b.getSystemService("power")).isPowerSaveMode();
        acx.copyOnWrite();
        acy acy2 = (acy) acx.instance;
        acy2.f158339a |= 4;
        acy2.f158342d = isPowerSaveMode;
        ada ada = (ada) adb.f158343d.createBuilder();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        ada.copyOnWrite();
        adb adb = (adb) ada.instance;
        adb.f158345a |= 1;
        adb.f158346b = availableProcessors;
        File[] listFiles = new File("/sys/devices/system/cpu/").listFiles();
        listFiles.getClass();
        C58485gu guVar = (C58485gu) DesugarArrays.stream((T[]) listFiles).filter(C25060be.f68305a).flatMap(C25061bf.f68306a).collect(C58370cn.f155946a);
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            int intValue = ((Integer) guVar.get(i)).intValue();
            ada.copyOnWrite();
            adb adb2 = (adb) ada.instance;
            C62961ch chVar = adb2.f158347c;
            if (!chVar.mo58948c()) {
                adb2.f158347c = C62942bv.mutableCopy(chVar);
            }
            adb2.f158347c.mo58916g(intValue);
        }
        boolean isCharging = batteryManager.isCharging();
        acx.copyOnWrite();
        acy acy3 = (acy) acx.instance;
        acy3.f158339a |= 2;
        acy3.f158341c = isCharging;
        acz acz = (acz) ade.f158354e.createBuilder();
        add add4 = (add) adc.build();
        acz.copyOnWrite();
        ade ade = (ade) acz.instance;
        add4.getClass();
        ade.f158357b = add4;
        ade.f158356a |= 1;
        acy acy4 = (acy) acx.build();
        acz.copyOnWrite();
        ade ade2 = (ade) acz.instance;
        acy4.getClass();
        ade2.f158358c = acy4;
        ade2.f158356a |= 2;
        adb adb3 = (adb) ada.build();
        acz.copyOnWrite();
        ade ade3 = (ade) acz.instance;
        adb3.getClass();
        ade3.f158359d = adb3;
        ade3.f158356a |= 4;
        return (ade) acz.build();
    }
}
