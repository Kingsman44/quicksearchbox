package com.google.android.apps.gsa.staticplugins.webview;

import androidx.core.p094f.C1888a;
import com.google.android.apps.gsa.shared.util.permissions.C91078e;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.webview.cv */
/* compiled from: PG */
public final /* synthetic */ class C118188cv implements C91078e {

    /* renamed from: a */
    public final /* synthetic */ C118189cw f328115a;

    public /* synthetic */ C118188cv(C118189cw cwVar) {
        this.f328115a = cwVar;
    }

    /* renamed from: a */
    public final void mo18206a(String[] strArr, int[] iArr) {
        C118189cw cwVar = this.f328115a;
        boolean z = true;
        boolean z2 = true;
        for (int i = 0; i < strArr.length; i++) {
            if ((strArr[i].equals("android.permission.READ_EXTERNAL_STORAGE") || strArr[i].equals("android.permission.READ_MEDIA_IMAGES")) && iArr[i] == -1) {
                ((C59052c) ((C59052c) C118189cw.f328116a.mo56226d()).mo56372aa(33877)).mo56386p("User denied storage read permission.");
                z = false;
            }
            if (strArr[i].equals("android.permission.CAMERA") && iArr[i] == -1) {
                ((C59052c) ((C59052c) C118189cw.f328116a.mo56226d()).mo56372aa(33876)).mo56386p("User denied camera permission.");
                z2 = false;
            }
            if (strArr[i].equals("android.permission.WRITE_EXTERNAL_STORAGE") && !C1888a.m5150d() && iArr[i] == -1) {
                ((C59052c) ((C59052c) C118189cw.f328116a.mo56226d()).mo56372aa(33875)).mo56386p("User denied write permission.");
                z2 = false;
            }
        }
        cwVar.mo103648a(z, z2);
    }
}
