package com.google.android.libraries.appdoctor.p574b;

import android.content.Context;
import android.util.Log;
import androidx.core.content.C1879e;
import com.google.android.gms.p10747b.p10748a.C142954b;
import com.google.android.gms.p10747b.p10748a.C142960h;
import com.google.android.gms.p10747b.p10748a.C142967o;
import com.google.android.libraries.appdoctor.p573a.C10448e;
import com.google.android.libraries.appdoctor.p573a.C10454k;
import com.google.common.base.C58833ax;
import com.google.protobuf.C62971cq;
import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.google.android.libraries.appdoctor.b.d */
/* compiled from: PG */
public final class C10466d extends C10448e {
    public C10466d() {
        super(C142954b.FILE_DELETION, 10);
    }

    /* renamed from: e */
    private static void m25438e(File file, FilenameFilter filenameFilter) {
        for (File file2 : file.listFiles()) {
            if (file2.isDirectory()) {
                m25438e(file2, filenameFilter);
            } else if (filenameFilter.accept(file, file2.getName()) && !file2.delete()) {
                Log.w("FILE_DELETION", "Unable to delete file: ".concat(String.valueOf(String.valueOf(file2))));
            }
        }
    }

    /* renamed from: a */
    public final String mo18487a() {
        return "FILE_DELETION";
    }

    /* renamed from: c */
    public final void mo18489c(C10454k kVar, C58833ax axVar) {
        C142960h hVar;
        if (!axVar.mo56113h() || ((C142967o) axVar.mo56107c()).f387918a != 1) {
            throw new IllegalArgumentException();
        }
        Context context = kVar.f35203b;
        C142967o oVar = (C142967o) axVar.mo56107c();
        if (oVar.f387918a == 1) {
            hVar = (C142960h) oVar.f387919b;
        } else {
            hVar = C142960h.f387889c;
        }
        int i = hVar.f387891a;
        int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i2 == 0) {
            i2 = 1;
        }
        int i3 = i2 - 2;
        if (i3 == 1) {
            C62971cq cqVar = hVar.f387892b;
            File b = C1879e.m5132b(context);
            m25438e(b, new C10465c(b, cqVar));
        } else if (i3 == 2) {
            C62971cq cqVar2 = hVar.f387892b;
            File b2 = C1879e.m5132b(context.createDeviceProtectedStorageContext());
            m25438e(b2, new C10465c(b2, cqVar2));
        } else if (i3 == 3) {
            C62971cq cqVar3 = hVar.f387892b;
            File externalFilesDir = context.getExternalFilesDir((String) null);
            m25438e(externalFilesDir, new C10465c(externalFilesDir, cqVar3));
        } else {
            throw new UnsupportedOperationException("This storage type does not supported");
        }
    }

    /* renamed from: d */
    public final boolean mo18490d() {
        return true;
    }
}
