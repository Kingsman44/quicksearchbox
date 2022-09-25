package com.google.ads.interactivemedia.p367v3.internal;

import com.google.ads.interactivemedia.p367v3.impl.data.C6731ax;
import java.io.IOException;
import java.io.StringWriter;

/* renamed from: com.google.ads.interactivemedia.v3.internal.agj */
/* compiled from: PG */
public class agj {
    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            ald ald = new ald(stringWriter);
            ald.mo14897m(true);
            C6731ax.m18026b(this, ald);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
