package com.google.apps.tiktok.account.p3606d;

import com.google.common.p4522b.C58528ij;
import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.google.apps.tiktok.account.d.f */
/* compiled from: PG */
public final /* synthetic */ class C46088f implements FilenameFilter {

    /* renamed from: a */
    public final /* synthetic */ C58528ij f120960a;

    /* renamed from: b */
    public final /* synthetic */ C58528ij f120961b;

    public /* synthetic */ C46088f(C58528ij ijVar, C58528ij ijVar2) {
        this.f120960a = ijVar;
        this.f120961b = ijVar2;
    }

    public final boolean accept(File file, String str) {
        C58528ij ijVar = this.f120960a;
        C58528ij ijVar2 = this.f120961b;
        File file2 = new File(file, str);
        try {
            Integer valueOf = Integer.valueOf(str);
            if (valueOf.intValue() < 0) {
                return false;
            }
            if (ijVar != null && ijVar.contains(valueOf)) {
                return false;
            }
            if (ijVar2 != null && !ijVar2.contains(valueOf)) {
                return false;
            }
            if (!file2.isDirectory()) {
                return false;
            }
            if (file2.canWrite()) {
                return true;
            }
            return false;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
