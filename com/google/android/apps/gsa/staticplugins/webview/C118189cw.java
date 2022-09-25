package com.google.android.apps.gsa.staticplugins.webview;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import androidx.core.p094f.C1888a;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.shared.util.permissions.C91079f;
import com.google.android.apps.gsa.shared.util.permissions.ProxyIntentStarter;
import com.google.android.apps.gsa.shared.util.permissions.ProxyPermissionsRequester;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.webview.cw */
/* compiled from: PG */
public final class C118189cw {

    /* renamed from: a */
    public static final C59071e f328116a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.webview.cw");

    /* renamed from: b */
    public static final String[] f328117b = {"android.permission.READ_EXTERNAL_STORAGE"};

    /* renamed from: c */
    public final Context f328118c;

    /* renamed from: d */
    public final C91079f f328119d;

    /* renamed from: e */
    public final String[] f328120e;

    /* renamed from: f */
    public ValueCallback f328121f;

    /* renamed from: g */
    public WebChromeClient.FileChooserParams f328122g;

    /* renamed from: h */
    public Uri f328123h;

    /* renamed from: i */
    private final C91097g f328124i;

    public C118189cw(Context context, ProxyIntentStarter proxyIntentStarter, C91097g gVar) {
        ProxyPermissionsRequester proxyPermissionsRequester = new ProxyPermissionsRequester(gVar, context);
        this.f328118c = context;
        this.f328124i = proxyIntentStarter;
        this.f328119d = proxyPermissionsRequester;
        if (C1888a.m5150d()) {
            this.f328120e = new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.CAMERA"};
            return;
        }
        this.f328120e = new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.CAMERA"};
    }

    /* renamed from: a */
    public final void mo103648a(boolean z, boolean z2) {
        Uri uri;
        WebChromeClient.FileChooserParams fileChooserParams = this.f328122g;
        if (fileChooserParams != null) {
            Intent intent = null;
            Intent createIntent = z ? fileChooserParams.createIntent() : null;
            if (mo103649b() && z2) {
                Intent intent2 = new Intent("android.media.action.IMAGE_CAPTURE");
                if (intent2.resolveActivity(this.f328118c.getPackageManager()) != null) {
                    String str = "JPG_" + System.currentTimeMillis();
                    File file = new File(String.valueOf(Environment.getExternalStorageDirectory().getAbsolutePath()).concat("/Photos/"));
                    if (file.exists() || file.mkdir()) {
                        try {
                            uri = Uri.fromFile(File.createTempFile(str, ".jpg", file));
                        } catch (IOException e) {
                            ((C59052c) ((C59052c) ((C59052c) f328116a.mo56225c()).mo56382g(e)).mo56372aa(33872)).mo56354G("Couldn't create file %s in directory %s.", str, file.getAbsolutePath());
                        }
                    } else {
                        ((C59052c) ((C59052c) f328116a.mo56226d()).mo56372aa(33873)).mo56389s("Directory %s couldn't be created.", file.getAbsolutePath());
                        uri = null;
                    }
                    this.f328123h = uri;
                    if (uri != null) {
                        intent2.putExtra("output", uri);
                        intent = intent2;
                    }
                } else {
                    ((C59052c) ((C59052c) f328116a.mo56226d()).mo56372aa(33871)).mo56386p("No camera activity found.");
                }
            }
            ArrayList arrayList = new ArrayList();
            if (createIntent != null) {
                arrayList.add(createIntent);
            }
            if (intent != null) {
                arrayList.add(intent);
            }
            if (arrayList.isEmpty()) {
                ((C59052c) ((C59052c) f328116a.mo56226d()).mo56372aa(33878)).mo56386p("No intents found to start a file chooser from.");
                return;
            }
            Intent intent3 = new Intent("android.intent.action.CHOOSER");
            intent3.putExtra("android.intent.extra.INTENT", createIntent != null ? createIntent : intent);
            intent3.putExtra("android.intent.extra.TITLE", this.f328118c.getResources().getString(R.string.file_chooser_select_images));
            if (!(createIntent == null || intent == null)) {
                intent3.putExtra("android.intent.extra.INITIAL_INTENTS", new Intent[]{intent});
            }
            this.f328124i.mo65090b(intent3, new C118187cu(this));
        }
    }

    /* renamed from: b */
    public final boolean mo103649b() {
        WebChromeClient.FileChooserParams fileChooserParams = this.f328122g;
        if (fileChooserParams == null) {
            return false;
        }
        for (String startsWith : fileChooserParams.getAcceptTypes()) {
            if (startsWith.startsWith("image")) {
                return true;
            }
        }
        return false;
    }
}
