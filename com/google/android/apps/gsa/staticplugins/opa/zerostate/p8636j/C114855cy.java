package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j;

import android.content.ClipData;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.assistant.p3994s.p3995a.C53292im;
import com.google.assistant.p3994s.p3995a.C53293in;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.j.cy */
/* compiled from: PG */
public final /* synthetic */ class C114855cy implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C114860dc f318648a;

    /* renamed from: b */
    public final /* synthetic */ String f318649b;

    /* renamed from: c */
    public final /* synthetic */ Uri f318650c;

    /* renamed from: d */
    public final /* synthetic */ String f318651d;

    /* renamed from: e */
    public final /* synthetic */ C53293in f318652e;

    public /* synthetic */ C114855cy(C114860dc dcVar, String str, Uri uri, String str2, C53293in inVar) {
        this.f318648a = dcVar;
        this.f318649b = str;
        this.f318650c = uri;
        this.f318651d = str2;
        this.f318652e = inVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C114860dc dcVar = this.f318648a;
        String str = this.f318649b;
        Uri uri = this.f318650c;
        String str2 = this.f318651d;
        C53293in inVar = this.f318652e;
        byte[] bArr = (byte[]) obj;
        if (bArr == null || bArr.length == 0) {
            dcVar.mo101658c(str, new IOException("Fetching image bytes failure"));
            return;
        }
        C58976aa aaVar = C58975e.f156826a;
        if (!C58837ba.m90859h(str2)) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setPackage(str2);
            intent.putExtra("android.intent.extra.STREAM", uri);
            intent.setType("image/*");
            intent.setFlags(268435456);
            intent.addFlags(1);
            C91097g gVar = dcVar.f318683p;
            if (gVar == null) {
                C59104x d = C114860dc.f318661a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "ZSIntentHandler");
                ((C59052c) ((C59052c) d).mo56372aa(29632)).mo56386p("#shareImageWithApp(): defaultIntentStarter is null.");
                return;
            }
            gVar.mo65089a(intent);
            return;
        }
        Intent intent2 = new Intent();
        intent2.setAction("android.intent.action.SEND");
        intent2.setFlags(268435456);
        intent2.setClipData(ClipData.newRawUri(BuildConfig.FLAVOR, uri));
        intent2.putExtra("android.intent.extra.STREAM", uri);
        intent2.setType("image/*");
        intent2.addFlags(1);
        Intent createChooser = Intent.createChooser(intent2, (CharSequence) null);
        List<ResolveInfo> queryIntentActivities = dcVar.f318670c.getPackageManager().queryIntentActivities(intent2, 0);
        ArrayList arrayList = new ArrayList();
        for (C53292im imVar : inVar.f139723d) {
            if (!imVar.f139716b.isEmpty()) {
                arrayList.add(new ComponentName(imVar.f139715a, imVar.f139716b));
            } else {
                for (ResolveInfo next : queryIntentActivities) {
                    if (next.activityInfo.packageName.equals(imVar.f139715a)) {
                        arrayList.add(new ComponentName(next.activityInfo.packageName, next.activityInfo.name));
                    }
                }
            }
        }
        ComponentName[] componentNameArr = (ComponentName[]) arrayList.toArray(new ComponentName[arrayList.size()]);
        if (componentNameArr.length > 0) {
            createChooser.putExtra("android.intent.extra.EXCLUDE_COMPONENTS", componentNameArr);
        }
        C91097g gVar2 = dcVar.f318683p;
        if (gVar2 != null) {
            gVar2.mo65089a(createChooser);
            return;
        }
        C59104x d2 = C114860dc.f318661a.mo56226d();
        d2.mo56378ag(C58975e.f156826a, "ZSIntentHandler");
        ((C59052c) ((C59052c) d2).mo56372aa(29631)).mo56386p("#shareImageThroughSharesheet(): defaultIntentStarter is null.");
    }
}
