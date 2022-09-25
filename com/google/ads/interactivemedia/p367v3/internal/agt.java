package com.google.ads.interactivemedia.p367v3.internal;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

/* renamed from: com.google.ads.interactivemedia.v3.internal.agt */
/* compiled from: PG */
public abstract class agt {
    public final Object fromJson(Reader reader) {
        return read(new alb(reader));
    }

    public final Object fromJsonTree(agj agj) {
        try {
            return read(new ais(agj));
        } catch (IOException e) {
            throw new agk((Throwable) e);
        }
    }

    public final agt nullSafe() {
        return new ags(this);
    }

    public abstract Object read(alb alb);

    public final void toJson(Writer writer, Object obj) {
        write(new ald(writer), obj);
    }

    public final agj toJsonTree(Object obj) {
        try {
            aiu aiu = new aiu();
            write(aiu, obj);
            return aiu.mo14843a();
        } catch (IOException e) {
            throw new agk((Throwable) e);
        }
    }

    public abstract void write(ald ald, Object obj);

    public final Object fromJson(String str) {
        return fromJson((Reader) new StringReader(str));
    }

    public final String toJson(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            toJson(stringWriter, obj);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
