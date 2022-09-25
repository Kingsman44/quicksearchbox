package com.google.android.apps.gsa.assistant.settings.devices.bisto;

import android.content.Intent;
import android.widget.Toast;
import androidx.preference.C4024t;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import com.google.common.base.C58827ar;
import com.google.common.base.C58837ba;
import com.google.common.base.C58869cf;
import com.google.common.base.C58903m;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.bisto.aj */
/* compiled from: PG */
public final /* synthetic */ class C9564aj implements C4024t {

    /* renamed from: a */
    public final /* synthetic */ C9569ao f33139a;

    public /* synthetic */ C9564aj(C9569ao aoVar) {
        this.f33139a = aoVar;
    }

    /* renamed from: b */
    public final boolean mo8421b(Preference preference) {
        EditTextPreference editTextPreference;
        String str = ".bin";
        C9569ao aoVar = this.f33139a;
        int i = 1;
        if (aoVar.f33148m == null || (editTextPreference = aoVar.f33149n) == null || aoVar.f33150o == null || aoVar.f33151p == null) {
            C59104x c = C9569ao.f33144i.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BistoOtaCtrl");
            ((C59052c) ((C59052c) c).mo56372aa(368)).mo56386p("Preferences are not initialized");
            return true;
        }
        String str2 = editTextPreference.f12703g;
        if (str2 == null) {
            str2 = "0";
        }
        int i2 = 0;
        try {
            List i3 = C58869cf.m90936b(new C58903m(',')).mo56155i(str2);
            String str3 = aoVar.f33148m.f12703g;
            if (str3 != null) {
                List i4 = C58869cf.m90936b(new C58903m(',')).mo56155i(str3);
                ArrayList arrayList = new ArrayList();
                for (int i5 = 0; i5 < i4.size(); i5++) {
                    String str4 = (String) i4.get(i5);
                    if (!str4.toLowerCase(Locale.US).startsWith("http://") && !str4.toLowerCase(Locale.US).startsWith("https://")) {
                        str4 = "http://www.gstatic.com/bisto/ota/system/".concat(String.valueOf(str4));
                    }
                    arrayList.add(str4);
                }
                String str5 = (String) C58557jl.m90131l(arrayList);
                for (int size = arrayList.size(); size < i3.size(); size++) {
                    arrayList.add(str5);
                }
                String str6 = aoVar.f33148m.f12703g;
                String str7 = aoVar.f33150o.f12703g;
                if (str6 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    if (C58837ba.m90859h(str7)) {
                        List i6 = C58869cf.m90936b(new C58903m(',')).mo56155i(str6);
                        int i7 = 0;
                        while (i7 < i6.size()) {
                            String str8 = (String) i6.get(i7);
                            if (str8 != null) {
                                String lowerCase = str8.toLowerCase(Locale.getDefault());
                                if (lowerCase.lastIndexOf(47) >= 0) {
                                    lowerCase = lowerCase.substring(lowerCase.lastIndexOf(47) + i);
                                }
                                if (lowerCase.lastIndexOf(45) >= 0) {
                                    lowerCase = lowerCase.substring(lowerCase.lastIndexOf(45) + i);
                                }
                                char c2 = '_';
                                if (lowerCase.lastIndexOf(95) >= 0) {
                                    lowerCase = lowerCase.substring(lowerCase.lastIndexOf(95) + i);
                                }
                                if (!lowerCase.endsWith(str)) {
                                    if (!lowerCase.endsWith(".dfu")) {
                                        throw new IllegalArgumentException("Not a valid file extension");
                                    }
                                }
                                String substring = lowerCase.substring(i2, Math.max(lowerCase.lastIndexOf(str), lowerCase.lastIndexOf(".dfu")));
                                if (!C58837ba.m90859h(substring)) {
                                    char[] charArray = substring.toCharArray();
                                    int length = charArray.length;
                                    int i8 = 0;
                                    while (i2 < length) {
                                        String str9 = str;
                                        char c3 = charArray[i2];
                                        if (!(c3 == c2 || c3 == '-')) {
                                            if (c3 == '.') {
                                                i8++;
                                            } else if (c3 < '0' || c3 > '9') {
                                                throw new IllegalArgumentException("Illegal build label: ".concat(String.valueOf(substring)));
                                            }
                                        }
                                        i2++;
                                        str = str9;
                                        c2 = '_';
                                    }
                                    String str10 = str;
                                    if (i8 == 2) {
                                        C59104x b = C9569ao.f33144i.mo56224b();
                                        b.mo56378ag(C58975e.f156826a, "BistoOtaCtrl");
                                        ((C59052c) ((C59052c) b).mo56372aa(365)).mo56389s("Extracted build label: %s", substring);
                                        arrayList2.add(substring);
                                        i7++;
                                        str = str10;
                                        i = 1;
                                        i2 = 0;
                                    } else {
                                        throw new IllegalArgumentException("Illegal build label: ".concat(String.valueOf(substring)));
                                    }
                                } else {
                                    throw new IllegalArgumentException("No build label in file name");
                                }
                            } else {
                                throw new IllegalArgumentException("No url");
                            }
                        }
                    } else {
                        C58869cf b2 = C58869cf.m90936b(new C58903m(','));
                        str7.getClass();
                        arrayList2.addAll(b2.mo56155i(str7));
                    }
                    String str11 = (String) C58557jl.m90131l(arrayList2);
                    for (int size2 = arrayList2.size(); size2 < i3.size(); size2++) {
                        arrayList2.add(str11);
                    }
                    Intent intent = new Intent("action_ota");
                    intent.putExtra("device_indexes", C58827ar.m90818c(',').mo56097d(i3));
                    intent.putExtra("dfu_url", C58827ar.m90818c(',').mo56097d(arrayList));
                    intent.putExtra("build_label", C58827ar.m90818c(',').mo56097d(arrayList2));
                    intent.putExtra("is_zero_day", aoVar.f33151p.f12789a);
                    aoVar.mo17875a(intent);
                    return true;
                }
                throw new IllegalArgumentException("No urlsString");
            }
            throw new IllegalArgumentException("No urlsString");
        } catch (IllegalArgumentException unused) {
            C59104x c4 = C9569ao.f33144i.mo56225c();
            c4.mo56378ag(C58975e.f156826a, "BistoOtaCtrl");
            ((C59052c) ((C59052c) c4).mo56372aa(369)).mo56389s("Illegal URL: %s", aoVar.f33148m.f12703g);
            Toast.makeText(aoVar.f32988d, "Illegal URL: ".concat(String.valueOf(aoVar.f33148m.f12703g)), 0).show();
            return true;
        }
    }
}
