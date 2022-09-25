package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.media.session.MediaController;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C63087y;
import com.google.protobuf.C63088z;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.er */
/* compiled from: PG */
public final /* synthetic */ class C108329er implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C108331et f301339a;

    /* renamed from: b */
    public final /* synthetic */ C22871g f301340b;

    /* renamed from: c */
    public final /* synthetic */ int f301341c;

    public /* synthetic */ C108329er(C108331et etVar, C22871g gVar, int i) {
        this.f301339a = etVar;
        this.f301340b = gVar;
        this.f301341c = i;
    }

    public final void run() {
        C108331et etVar = this.f301339a;
        C22871g gVar = this.f301340b;
        int i = this.f301341c;
        synchronized (etVar) {
            C63088z zVar = null;
            etVar.f301347f = etVar.f301344c.mo81722a((String) null, false, true);
            MediaController mediaController = etVar.f301347f;
            if (mediaController != null) {
                if (Objects.equals(mediaController.getPackageName(), etVar.f301350i)) {
                    if (etVar.f301351j) {
                        C58976aa aaVar = C58975e.f156826a;
                        return;
                    }
                    MediaController mediaController2 = etVar.f301347f;
                    if (mediaController2 == null) {
                        C58976aa aaVar2 = C58975e.f156826a;
                    } else {
                        String packageName = mediaController2.getPackageName();
                        try {
                            Drawable applicationIcon = etVar.f301343b.getPackageManager().getApplicationIcon(packageName);
                            Bitmap createBitmap = Bitmap.createBitmap(applicationIcon.getIntrinsicWidth(), applicationIcon.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(createBitmap);
                            applicationIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                            applicationIcon.draw(canvas);
                            C63087y v = C63088z.m96150v();
                            createBitmap.compress(Bitmap.CompressFormat.PNG, 100, v);
                            zVar = v.mo59165b();
                        } catch (PackageManager.NameNotFoundException e) {
                            C59104x c = C108331et.f301342a.mo56225c();
                            c.mo56378ag(C58975e.f156826a, "MediaServiceObservable");
                            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(24002)).mo56389s("media provider name not found %s", packageName);
                        }
                    }
                    etVar.f301349h = zVar;
                    etVar.f301347f.registerCallback(etVar);
                    etVar.f301348g = true;
                    etVar.onMetadataChanged(etVar.f301347f.getMetadata());
                    return;
                }
            }
            etVar.f301347f = null;
            etVar.mo96793b(gVar, i + 1);
        }
    }
}
