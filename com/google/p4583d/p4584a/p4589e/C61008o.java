package com.google.p4583d.p4584a.p4589e;

import com.google.p4583d.p4584a.C61012g;
import com.google.p4583d.p4584a.p4588d.C60980g;
import com.google.p4583d.p4584a.p4588d.C60987n;
import java.util.List;

/* renamed from: com.google.d.a.e.o */
/* compiled from: PG */
public final class C61008o extends C60995b {
    /* renamed from: a */
    public final C60987n mo57517a(String str, C61012g gVar, List list) {
        if (str == null || str.isEmpty() || !gVar.mo57531g(str)) {
            throw new IllegalArgumentException(String.format("Command not found: %s", new Object[]{str}));
        }
        C60987n c = gVar.mo57527c(str);
        if (c instanceof C60980g) {
            return ((C60980g) c).mo57451a(gVar, list);
        }
        throw new IllegalArgumentException(String.format("Function %s is not defined", new Object[]{str}));
    }
}
