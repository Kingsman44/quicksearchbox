package com.google.android.libraries.storage.protostore;

import android.content.SharedPreferences;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.storage.protostore.ca */
/* compiled from: PG */
public final /* synthetic */ class C42933ca implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C42939cg f112316a;

    public /* synthetic */ C42933ca(C42939cg cgVar) {
        this.f112316a = cgVar;
    }

    public final Object call() {
        C42939cg cgVar = this.f112316a;
        Set<String> set = cgVar.f112331c;
        if (set == null) {
            set = cgVar.f112333e.getAll().keySet();
        }
        SharedPreferences.Editor edit = cgVar.f112333e.edit();
        for (String remove : set) {
            edit.remove(remove);
        }
        if (!edit.commit()) {
            throw new IOException("Failed to remove migrated SharedPreferences keys: ".concat(String.valueOf(cgVar.f112330b)));
        } else if (!cgVar.f112332d || !cgVar.f112333e.getAll().isEmpty()) {
            return null;
        } else {
            File file = new File(new File(cgVar.f112329a.getApplicationInfo().dataDir, "shared_prefs"), String.valueOf(cgVar.f112330b).concat(".xml"));
            File file2 = new File(String.valueOf(file.getPath()).concat(".bak"));
            file.delete();
            file2.delete();
            if (!file.exists() && !file2.exists()) {
                return null;
            }
            throw new IOException("Failed to delete empty SharedPreferences file: ".concat(String.valueOf(cgVar.f112330b)));
        }
    }
}
