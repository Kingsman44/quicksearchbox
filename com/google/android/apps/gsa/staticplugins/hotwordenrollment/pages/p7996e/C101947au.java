package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7996e;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.speech.audio.C92158b;
import com.google.android.apps.gsa.speech.audio.C92173d;
import com.google.android.apps.gsa.speech.audio.C92185e;
import com.google.android.apps.gsa.speech.audio.C92195f;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.C92419y;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.speech.p5218j.C67139mm;
import java.io.File;
import java.util.HashMap;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.e.au */
/* compiled from: PG */
public final /* synthetic */ class C101947au implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C101959bf f284439a;

    public /* synthetic */ C101947au(C101959bf bfVar) {
        this.f284439a = bfVar;
    }

    public final C60870cx apply(Object obj) {
        C101959bf bfVar = this.f284439a;
        C92419y yVar = (C92419y) obj;
        if (yVar.f257742b) {
            bfVar.mo92739o(bfVar.f284468d);
            if (!bfVar.f284473i.mo70891j()) {
                C67139mm mmVar = yVar.f257744d;
                if (mmVar == null) {
                    mmVar = C67139mm.f182496e;
                }
                C92195f a = bfVar.f284469e.mo86868a(C92185e.f257011b);
                HashMap hashMap = new HashMap();
                String str = BuildConfig.FLAVOR;
                for (Integer intValue : mmVar.f182501d) {
                    int intValue2 = intValue.intValue();
                    int i = 0;
                    if (intValue2 != 0) {
                        switch (intValue2) {
                            case 9:
                                str = "ENROLLMENT_HOTWORD_NOT_DETECTED_DURING_ENROLLMENT";
                                Integer num = (Integer) hashMap.get(str);
                                if (num != null) {
                                    i = num.intValue() + 1;
                                }
                                hashMap.put(str, Integer.valueOf(i));
                                break;
                            case 10:
                                str = "ENROLLMENT_SUCCESS_WITH_LOW_CONFIDENCE";
                                Integer num2 = (Integer) hashMap.get(str);
                                if (num2 != null) {
                                    i = num2.intValue() + 1;
                                }
                                hashMap.put(str, Integer.valueOf(i));
                                break;
                            case 11:
                                str = "ENROLLMENT_UNKNOWN_STATUS";
                                Integer num3 = (Integer) hashMap.get(str);
                                if (num3 != null) {
                                    i = num3.intValue() + 1;
                                }
                                hashMap.put(str, Integer.valueOf(i));
                                break;
                        }
                    } else {
                        str = "ENROLLMENT_SUCCESS";
                        Integer num4 = (Integer) hashMap.get(str);
                        if (num4 != null) {
                            i = num4.intValue() + 1;
                        }
                        hashMap.put(str, Integer.valueOf(i));
                    }
                    C59104x b = C101959bf.f284455a.mo56224b();
                    b.mo56378ag(C58975e.f156826a, "SodaHotwordDController");
                    ((C59052c) ((C59052c) b).mo56372aa(20517)).mo56389s("enrollment status- %s", str);
                }
                if (!hashMap.isEmpty()) {
                    StringBuilder sb = new StringBuilder("TSC:");
                    sb.append(bfVar.f284471g.mo26870b());
                    sb.append("\n");
                    for (String str2 : hashMap.keySet()) {
                        sb.append(str2);
                        sb.append(":");
                        sb.append(((Integer) hashMap.get(str2)).intValue() + 1);
                        sb.append(",");
                    }
                    a.f257043c.mo28201a("Dump metadata file", new C92158b(sb.toString(), new File(a.mo86856c(), "enrollment_metadata.txt")));
                } else {
                    C59104x d = C101959bf.f284455a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "SodaHotwordDController");
                    ((C59052c) ((C59052c) d).mo56372aa(20516)).mo56386p("Enrollment status map is empty.");
                }
            }
        }
        if (yVar.f257743c) {
            bfVar.mo92739o(C92173d.TISID_ENROLLMENT);
        }
        int i2 = yVar.f257741a;
        if (((i2 & 1) == 0 || yVar.f257742b) && ((i2 & 2) == 0 || yVar.f257743c)) {
            return C60866ct.f164955a;
        }
        return C60856cj.m92899h(new Exception("Enrollment failed."));
    }
}
