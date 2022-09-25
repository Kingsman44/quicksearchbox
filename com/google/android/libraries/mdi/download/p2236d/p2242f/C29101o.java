package com.google.android.libraries.mdi.download.p2236d.p2242f;

import android.content.Context;
import android.util.Base64;
import com.google.android.libraries.mdi.download.C29392ep;
import com.google.common.base.C58833ax;
import com.google.protobuf.C62974ct;
import java.io.File;

/* renamed from: com.google.android.libraries.mdi.download.d.f.o */
/* compiled from: PG */
public final class C29101o {
    /* renamed from: a */
    public static C29392ep m54017a(String str) {
        try {
            return (C29392ep) C29111y.m54039b(str, C29392ep.f79679g.getParserForType());
        } catch (C62974ct e) {
            throw new C29100n("Failed to deserialize key:".concat(String.valueOf(str)), e);
        }
    }

    /* renamed from: b */
    public static File m54018b(Context context, C58833ax axVar) {
        String str = "gms_icing_mdd_garbage_file";
        if (axVar != null && axVar.mo56113h()) {
            str = str.concat(String.valueOf((String) axVar.mo56107c()));
        }
        return new File(context.getFilesDir(), str);
    }

    /* renamed from: c */
    public static String m54019c(C29392ep epVar) {
        return Base64.encodeToString(epVar.toByteArray(), 3);
    }
}
