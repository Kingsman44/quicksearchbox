package com.google.android.apps.gsa.staticplugins.nga.p8089t.p8090a;

import com.google.common.p4526f.p4527a.C58970a;
import com.google.protobuf.C63042fg;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.Callable;
import org.p5610a.p5611a.p5612a.C71978d;
import p3186j$.util.DesugarArrays;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.a.ba */
/* compiled from: PG */
public final /* synthetic */ class C103848ba implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C103868bu f289099a;

    /* renamed from: b */
    public final /* synthetic */ C103877cc f289100b;

    public /* synthetic */ C103848ba(C103868bu buVar, C103877cc ccVar) {
        this.f289099a = buVar;
        this.f289100b = ccVar;
    }

    public final Object call() {
        C103868bu buVar = this.f289099a;
        C103877cc ccVar = this.f289100b;
        File f = C103868bu.m171814f(buVar.f289131c);
        File[] listFiles = f.listFiles();
        if (listFiles == null) {
            ((C58970a) ((C58970a) C103868bu.f289129a.mo56226d()).mo56372aa(21791)).mo56386p("Failed to list files in events directory: writing is cancelled");
            return null;
        }
        if (listFiles.length >= 100) {
            Arrays.sort(listFiles, C103868bu.f289130b);
            for (int i = 0; i < listFiles.length - 99; i++) {
                if (!listFiles[i].delete()) {
                    ((C58970a) ((C58970a) C103868bu.f289129a.mo56226d()).mo56372aa(21790)).mo56389s("Failed to delete an old event file %s", listFiles[i]);
                    return null;
                }
            }
        }
        Locale locale = Locale.US;
        Object[] objArr = new Object[2];
        C63042fg fgVar = ccVar.f289169d;
        if (fgVar == null) {
            fgVar = C63042fg.f170152c;
        }
        objArr[0] = Long.valueOf(fgVar.f170154a);
        C63042fg fgVar2 = ccVar.f289169d;
        if (fgVar2 == null) {
            fgVar2 = C63042fg.f170152c;
        }
        objArr[1] = Integer.valueOf(fgVar2.f170155b);
        String format = String.format(locale, "%d_%d_", objArr);
        int orElse = DesugarArrays.stream((T[]) listFiles).map(C103841au.f289093a).filter(new C103842av(format)).map(C103843aw.f289095a).map(C103844ax.f289096a).mapToInt(C103845ay.f289097a).max().orElse(-1);
        File file = new File(f, String.format(Locale.US, "%s%d.binarypb", new Object[]{format, Integer.valueOf(orElse + 1)}));
        try {
            byte[] byteArray = ccVar.toByteArray();
            BigInteger bigInteger = C71978d.f191683a;
            C71978d.m105278s(file, byteArray, byteArray.length);
            return null;
        } catch (IOException e) {
            ((C58970a) ((C58970a) ((C58970a) C103868bu.f289129a.mo56226d()).mo56382g(e)).mo56372aa(21789)).mo56389s("Failed to write new event file %s", file);
            return null;
        }
    }
}
