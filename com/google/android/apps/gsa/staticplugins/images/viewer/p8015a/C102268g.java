package com.google.android.apps.gsa.staticplugins.images.viewer.p8015a;

import android.content.Intent;
import androidx.core.content.FileProvider;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.base.C58825ap;
import com.google.common.base.C58827ar;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.a.g */
/* compiled from: PG */
public final class C102268g implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C102270i f285352a;

    public C102268g(C102270i iVar) {
        this.f285352a = iVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        C58833ax axVar;
        File[] listFiles;
        byte[] bArr = (byte[]) obj;
        File file = new File(this.f285352a.f285356c.getCacheDir(), "personal_photos");
        if (file.isDirectory() && file.exists() && (listFiles = file.listFiles()) != null) {
            for (File delete : listFiles) {
                delete.delete();
            }
        }
        File file2 = new File(this.f285352a.f285356c.getCacheDir(), new C58827ar(File.separator).mo56097d(new C58825ap(new Object[0], "personal_photos", "share_photo_" + new Random().nextInt() + ".png")));
        if (file2.getParentFile() != null) {
            file2.getParentFile().mkdirs();
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            fileOutputStream.write(bArr);
            fileOutputStream.close();
            axVar = C58833ax.m90834k(file2);
        } catch (IOException unused) {
            axVar = C58836b.f156633a;
        }
        if (axVar.mo56113h()) {
            C102270i iVar = this.f285352a;
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.STREAM", FileProvider.m5057a(iVar.f285356c, "com.google.android.apps.gsa.staticplugins.images.viewer.service.fileprovider").mo5044a((File) axVar.mo56107c()));
            intent.setType("image/png");
            intent.addFlags(1);
            iVar.f285361h.mo65089a(Intent.createChooser(intent, iVar.f285356c.getResources().getText(R.string.images_share_dialog_title)));
        }
    }
}
