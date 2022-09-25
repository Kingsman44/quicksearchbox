package org.p5610a.p5611a.p5612a;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.TreeMap;
import p3186j$.nio.charset.StandardCharsets;

/* renamed from: org.a.a.a.a */
/* compiled from: PG */
public final class C71956a {
    static {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        treeMap.put(StandardCharsets.ISO_8859_1.name(), StandardCharsets.ISO_8859_1);
        treeMap.put(StandardCharsets.US_ASCII.name(), StandardCharsets.US_ASCII);
        treeMap.put(StandardCharsets.UTF_16.name(), StandardCharsets.UTF_16);
        treeMap.put(StandardCharsets.UTF_16BE.name(), StandardCharsets.UTF_16BE);
        treeMap.put(StandardCharsets.UTF_16LE.name(), StandardCharsets.UTF_16LE);
        treeMap.put(StandardCharsets.UTF_8.name(), StandardCharsets.UTF_8);
        Collections.unmodifiableSortedMap(treeMap);
    }

    /* renamed from: a */
    public static Charset m105231a(Charset charset) {
        return charset == null ? Charset.defaultCharset() : charset;
    }
}
