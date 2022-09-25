package com.google.android.apps.gsa.nga.shared.p6339f.p6343d;

import android.os.RemoteException;
import com.google.android.apps.gsa.nga.api.a.g;
import com.google.android.apps.gsa.nga.api.a.h;
import com.google.android.apps.gsa.nga.api.a.i;
import com.google.android.apps.gsa.nga.shared.p6339f.p6340a.C81026c;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.nga.shared.f.d.a */
/* compiled from: PG */
public final class C81060a {

    /* renamed from: a */
    public static final C58974d f222174a = C58974d.m91136j();

    /* renamed from: a */
    public static String m129008a(String str) {
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        if (lowerCase.equals("pixel") || lowerCase.equals("pixel xl") || lowerCase.startsWith("pixel 2") || lowerCase.startsWith("pixel 3")) {
            return "False";
        }
        return (lowerCase.startsWith("pixel 4") || lowerCase.startsWith("pixel 5") || lowerCase.startsWith("pixel 6") || lowerCase.startsWith("pixel 7") || lowerCase.startsWith("pixel 8") || lowerCase.startsWith("pixel 9")) ? "True" : "N/A";
    }

    /* renamed from: b */
    public static void m129009b(C81026c cVar, h hVar) {
        ((C58970a) ((C58970a) f222174a.mo56224b()).mo56372aa(5813)).mo56389s("Rejecting bisto invocation with reason %s", hVar.name());
        try {
            g createBuilder = i.c.createBuilder();
            createBuilder.copyOnWrite();
            createBuilder.instance.a = hVar.getNumber();
            cVar.mo74812a(createBuilder.build().toByteArray());
        } catch (RemoteException e) {
            ((C58970a) ((C58970a) ((C58970a) f222174a.mo56226d()).mo56382g(e)).mo56372aa(5814)).mo56389s("Failed to reject bisto invocation with reason %s", hVar.name());
        }
    }
}
