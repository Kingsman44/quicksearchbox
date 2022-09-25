package com.google.android.libraries.assistant.auto.tng.p1028l.p1031b;

import com.evernote.android.state.BuildConfig;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Locale;

/* renamed from: com.google.android.libraries.assistant.auto.tng.l.b.d */
/* compiled from: PG */
public final class C13747d {

    /* renamed from: a */
    public static final /* synthetic */ int f41918a = 0;

    /* renamed from: b */
    private static final C13746c f41919b = new C13746c();

    /* renamed from: a */
    public static int m29996a() {
        int i;
        C13746c cVar = f41919b;
        if (cVar.f41916a != -1) {
            C58976aa aaVar = C58975e.f156826a;
            return cVar.f41916a;
        }
        try {
            File[] listFiles = new File("/sys/devices/system/cpu").listFiles(C13744a.f41911a);
            if (listFiles == null || (i = listFiles.length) <= 0) {
                i = -1;
            }
            cVar.f41916a = i;
            if (i == -1) {
                C58976aa aaVar2 = C58975e.f156826a;
            }
        } catch (RuntimeException unused) {
            f41919b.f41916a = Runtime.getRuntime().availableProcessors();
        }
        return f41919b.f41916a;
    }

    /* renamed from: b */
    public static int[] m29997b(C13745b bVar) {
        int a = m29996a();
        int[] iArr = (int[]) f41919b.f41917b.get(bVar);
        int i = 0;
        if (iArr != null) {
            while (i < a) {
                if (iArr[i] == -1) {
                    iArr[i] = m29998c(i, bVar);
                }
                i++;
            }
            C58976aa aaVar = C58975e.f156826a;
            bVar.name();
            return iArr;
        }
        int[] iArr2 = new int[a];
        while (i < a) {
            iArr2[i] = m29998c(i, bVar);
            i++;
        }
        if (bVar != C13745b.SCALING_CUR_FREQ) {
            f41919b.f41917b.put(bVar, iArr2);
        }
        return iArr2;
    }

    /* renamed from: c */
    private static int m29998c(int i, C13745b bVar) {
        String lowerCase = bVar.name().toLowerCase(Locale.ROOT);
        try {
            FileReader fileReader = new FileReader(new File("/sys/devices/system/cpu/cpu" + i + "/cpufreq/" + lowerCase));
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String readLine = bufferedReader.readLine();
            int parseInt = (readLine == null || BuildConfig.FLAVOR.equals(readLine)) ? -1 : Integer.parseInt(readLine.trim());
            bufferedReader.close();
            fileReader.close();
            return parseInt;
        } catch (Exception unused) {
            return -1;
        }
    }
}
