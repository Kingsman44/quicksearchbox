package com.google.android.libraries.search.rendering.xuikit.p3131d.p3138g;

import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.C21232ab;
import com.google.android.libraries.elements.p1714d.p1724f.p1725a.C21081e;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3139h.C40423i;
import java.util.NoSuchElementException;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.d.g.g */
/* compiled from: PG */
public final class C40395g {
    /* renamed from: a */
    public static ByteStore m70080a(C21232ab abVar) {
        if (abVar instanceof C21081e) {
            return ((C21081e) abVar).mo26138a();
        }
        if (abVar instanceof C40423i) {
            return ((C40423i) abVar).f106097a.mo26138a();
        }
        throw new NoSuchElementException("Unable to provide the ByteStore");
    }

    /* renamed from: b */
    public static C21232ab m70081b(Optional optional, C21232ab abVar) {
        if (optional.isEmpty() && abVar == null) {
            throw new NoSuchElementException("The default DataStore is missing and no custom DataStore has been provided.");
        } else if (abVar != null) {
            return abVar;
        } else {
            return (C21232ab) optional.get();
        }
    }
}
