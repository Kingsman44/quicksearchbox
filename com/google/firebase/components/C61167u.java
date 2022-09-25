package com.google.firebase.components;

import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.firebase.components.u */
/* compiled from: PG */
public final class C61167u extends C61168v {
    public C61167u(List list) {
        super("Dependency cycle detected: ".concat(String.valueOf(Arrays.toString(list.toArray()))));
    }
}
