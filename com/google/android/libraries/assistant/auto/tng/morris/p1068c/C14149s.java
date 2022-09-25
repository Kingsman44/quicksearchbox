package com.google.android.libraries.assistant.auto.tng.morris.p1068c;

import android.text.TextUtils;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.net.p4726a.p4727a.C62722b;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.c.s */
/* compiled from: PG */
public final /* synthetic */ class C14149s implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C14152v f42873a;

    /* renamed from: b */
    public final /* synthetic */ String f42874b;

    /* renamed from: c */
    public final /* synthetic */ String f42875c;

    public /* synthetic */ C14149s(C14152v vVar, String str, String str2) {
        this.f42873a = vVar;
        this.f42874b = str;
        this.f42875c = str2;
    }

    public final void run() {
        C14152v vVar = this.f42873a;
        String str = this.f42874b;
        String str2 = this.f42875c;
        C59104x b = C14152v.f42879a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "Morris.MedPlAppFlow");
        ((C59052c) ((C59052c) b).mo56372aa(45791)).mo56360M("Current media playback controller packageName %s serviceClassName %s. Original media item packageName %s, serviceClassName %s", str, str2, vVar.f42893o, vVar.f42894p);
        if (vVar.f42892n != null) {
            String str3 = vVar.f42893o;
            String str4 = vVar.f42894p;
            if (!TextUtils.isEmpty(str) && str.equals(str3)) {
                if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str4) || str2.equals(str4)) {
                    String str5 = vVar.f42892n;
                    if (str5 == null || !str5.equals(C14152v.f42884f)) {
                        if (vVar.f42895q != 0) {
                            long c = vVar.f42898t.mo26871c();
                            if (c > vVar.f42895q - C14152v.f42882d.toMillis() && c < vVar.f42895q + C14152v.f42883e.toMillis()) {
                                vVar.mo21477b(C37182a.f97845bX.mo40805c(C62722b.OK));
                                return;
                            }
                        }
                        if (vVar.f42896r.get() || C14152v.f42887i.contains(vVar.f42892n)) {
                            vVar.mo21477b(C37182a.f98191hz.mo40805c(C62722b.OK));
                        } else {
                            vVar.mo21477b(C37182a.f97844bW.mo40805c(C62722b.OK));
                        }
                    } else {
                        vVar.mo21477b(C37182a.f97840bS.mo40805c(C62722b.OK));
                    }
                }
            }
        }
    }
}
