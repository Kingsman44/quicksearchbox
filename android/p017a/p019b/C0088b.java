package android.p017a.p019b;

import android.p017a.p021d.C0114c;
import java.io.IOException;
import java.text.AttributedCharacterIterator;
import java.text.Format;
import java.util.List;
import java.util.Map;

/* renamed from: android.a.b.b */
/* compiled from: PG */
final class C0088b {

    /* renamed from: a */
    public final Appendable f236a;

    /* renamed from: b */
    public int f237b;

    /* renamed from: c */
    public List f238c = null;

    public C0088b(StringBuffer stringBuffer) {
        this.f236a = stringBuffer;
        this.f237b = stringBuffer.length();
    }

    /* renamed from: b */
    public final void mo36b(Format format, Object obj) {
        if (this.f238c == null) {
            mo35a(format.format(obj));
            return;
        }
        AttributedCharacterIterator formatToCharacterIterator = format.formatToCharacterIterator(obj);
        int i = this.f237b;
        Appendable appendable = this.f236a;
        try {
            int beginIndex = formatToCharacterIterator.getBeginIndex();
            int endIndex = formatToCharacterIterator.getEndIndex();
            int i2 = endIndex - beginIndex;
            if (beginIndex < endIndex) {
                appendable.append(formatToCharacterIterator.first());
                while (true) {
                    beginIndex++;
                    if (beginIndex >= endIndex) {
                        break;
                    }
                    appendable.append(formatToCharacterIterator.next());
                }
            }
            this.f237b = i2 + i;
            formatToCharacterIterator.first();
            int index = formatToCharacterIterator.getIndex();
            int endIndex2 = formatToCharacterIterator.getEndIndex();
            int i3 = i - index;
            while (index < endIndex2) {
                Map<AttributedCharacterIterator.Attribute, Object> attributes = formatToCharacterIterator.getAttributes();
                int runLimit = formatToCharacterIterator.getRunLimit();
                if (attributes.size() != 0) {
                    for (Map.Entry next : attributes.entrySet()) {
                        this.f238c.add(new C0089c((AttributedCharacterIterator.Attribute) next.getKey(), next.getValue(), i3 + index, i3 + runLimit));
                    }
                }
                formatToCharacterIterator.setIndex(runLimit);
                index = runLimit;
            }
        } catch (IOException e) {
            throw new C0114c(e);
        }
    }

    public C0088b(StringBuilder sb) {
        this.f236a = sb;
        this.f237b = sb.length();
    }

    /* renamed from: c */
    public final void mo37c(Format format, Object obj, String str) {
        if (this.f238c != null || str == null) {
            mo36b(format, obj);
        } else {
            mo35a(str);
        }
    }

    /* renamed from: a */
    public final void mo35a(CharSequence charSequence) {
        try {
            this.f236a.append(charSequence);
            this.f237b += charSequence.length();
        } catch (IOException e) {
            throw new C0114c(e);
        }
    }
}
