package com.google.android.libraries.lens.common.text;

import java.util.Iterator;

/* renamed from: com.google.android.libraries.lens.common.text.p */
/* compiled from: PG */
public final /* synthetic */ class C24140p {
    /* renamed from: a */
    public static /* synthetic */ String m44838a(CharSequence charSequence, Iterable iterable) {
        StringBuilder sb = new StringBuilder();
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append(charSequence);
            }
        }
        return sb.toString();
    }
}
