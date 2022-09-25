package org.p5623b.p5624a.p5626b.p5627a;

import java.util.Enumeration;
import java.util.Hashtable;

/* renamed from: org.b.a.b.a.a */
/* compiled from: PG */
public class C72043a {
    /* renamed from: a */
    public static Hashtable m105406a(Hashtable hashtable) {
        Hashtable hashtable2 = new Hashtable();
        Enumeration keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            Object nextElement = keys.nextElement();
            hashtable2.put(nextElement, hashtable.get(nextElement));
        }
        return hashtable2;
    }
}
