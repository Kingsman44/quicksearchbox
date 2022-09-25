package com.google.android.libraries.search.assistant.performer.deviceactions.screenshot;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.libraries.p11029ao.p11032c.C147805f;
import com.google.android.libraries.p11029ao.p11032c.C147806g;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.screenshot.c */
/* compiled from: PG */
public final /* synthetic */ class C35968c implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C35971f f94145a;

    /* renamed from: b */
    public final /* synthetic */ Bitmap f94146b;

    public /* synthetic */ C35968c(C35971f fVar, Bitmap bitmap) {
        this.f94145a = fVar;
        this.f94146b = bitmap;
    }

    public final C60870cx apply(Object obj) {
        FileOutputStream fileOutputStream;
        C35971f fVar = this.f94145a;
        Bitmap bitmap = this.f94146b;
        Uri uri = (Uri) obj;
        AssetFileDescriptor a = C147806g.m240907a(fVar.f94150b, uri, "w", C147805f.f398779a);
        if (a != null) {
            try {
                fileOutputStream = a.createOutputStream();
            } catch (IOException e) {
                FileNotFoundException fileNotFoundException = new FileNotFoundException("Unable to create stream");
                fileNotFoundException.initCause(e);
                C147806g.m240910d(a, fileNotFoundException);
                throw fileNotFoundException;
            }
        } else {
            fileOutputStream = null;
        }
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, new BufferedOutputStream(fileOutputStream));
        return C60856cj.m92900i(uri);
    }
}
