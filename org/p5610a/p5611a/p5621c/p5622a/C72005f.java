package org.p5610a.p5611a.p5621c.p5622a;

import java.io.Writer;
import java.security.InvalidParameterException;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/* renamed from: org.a.a.c.a.f */
/* compiled from: PG */
public final class C72005f extends C72001b {

    /* renamed from: b */
    private final Map f191736b;

    /* renamed from: c */
    private final BitSet f191737c;

    /* renamed from: d */
    private final int f191738d;

    /* renamed from: e */
    private final int f191739e;

    public C72005f(Map map) {
        if (map != null) {
            this.f191736b = new HashMap();
            this.f191737c = new BitSet();
            int i = Integer.MAX_VALUE;
            int i2 = 0;
            for (Map.Entry entry : map.entrySet()) {
                this.f191736b.put(((CharSequence) entry.getKey()).toString(), ((CharSequence) entry.getValue()).toString());
                this.f191737c.set(((CharSequence) entry.getKey()).charAt(0));
                int length = ((CharSequence) entry.getKey()).length();
                i = length < i ? length : i;
                if (length > i2) {
                    i2 = length;
                }
            }
            this.f191738d = i;
            this.f191739e = i2;
            return;
        }
        throw new InvalidParameterException("lookupMap cannot be null");
    }

    /* renamed from: a */
    public final int mo63213a(CharSequence charSequence, int i, Writer writer) {
        if (!this.f191737c.get(charSequence.charAt(i))) {
            return 0;
        }
        int i2 = this.f191739e;
        if (i + i2 > charSequence.length()) {
            i2 = charSequence.length() - i;
        }
        while (i2 >= this.f191738d) {
            String str = (String) this.f191736b.get(charSequence.subSequence(i, i + i2).toString());
            if (str != null) {
                writer.write(str);
                return i2;
            }
            i2--;
        }
        return 0;
    }
}
