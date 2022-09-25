package com.google.common.p4541l;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4536h.C59236ac;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: com.google.common.l.aa */
/* compiled from: PG */
public final class C59313aa implements C59236ac {
    /* renamed from: a */
    public static final Iterable m92157a(File file) {
        File[] listFiles;
        if (!file.isDirectory() || (listFiles = file.listFiles()) == null) {
            return C58485gu.m89845m();
        }
        return Collections.unmodifiableList(Arrays.asList(listFiles));
    }
}
