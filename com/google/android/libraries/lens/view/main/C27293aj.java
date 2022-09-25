package com.google.android.libraries.lens.view.main;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Build;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.lens.view.main.aj */
/* compiled from: PG */
public final /* synthetic */ class C27293aj implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C27327bq f74700a;

    /* renamed from: b */
    public final /* synthetic */ String f74701b;

    public /* synthetic */ C27293aj(C27327bq bqVar, String str) {
        this.f74700a = bqVar;
        this.f74701b = str;
    }

    public final void run() {
        C27327bq bqVar = this.f74700a;
        String str = this.f74701b;
        ClipboardManager clipboardManager = (ClipboardManager) bqVar.f74800e.getSystemService("clipboard");
        if (clipboardManager == null) {
            ((C59052c) ((C59052c) C27327bq.f74753a.mo56225c()).mo56372aa(49731)).mo56386p("Failed to get clipboard system service.");
            return;
        }
        String string = bqVar.f74800e.getString(R.string.lens_copied_to_clipboard);
        clipboardManager.setPrimaryClip(ClipData.newPlainText(string, str));
        if (Build.VERSION.SDK_INT <= 32) {
            C27322bl blVar = bqVar.f74787ag;
            blVar.getClass();
            blVar.mo32863m(string);
        }
    }
}
