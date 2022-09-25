package androidx.media3.extractor;

import androidx.media3.common.Metadata;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.extractor.metadata.id3.CommentFrame;
import androidx.media3.extractor.metadata.id3.InternalFrame;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: androidx.media3.extractor.an */
/* compiled from: PG */
public final class C3339an {

    /* renamed from: c */
    private static final Pattern f10072c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a */
    public int f10073a = -1;

    /* renamed from: b */
    public int f10074b = -1;

    /* renamed from: c */
    private final boolean m9679c(String str) {
        Matcher matcher = f10072c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String group = matcher.group(1);
            int i = C2612ak.f7249a;
            int parseInt = Integer.parseInt(group, 16);
            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.f10073a = parseInt;
            this.f10074b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo7332a() {
        return (this.f10073a == -1 || this.f10074b == -1) ? false : true;
    }

    /* renamed from: b */
    public final void mo7333b(Metadata metadata) {
        int i = 0;
        while (true) {
            Metadata.Entry[] entryArr = metadata.f7056a;
            if (i < entryArr.length) {
                Metadata.Entry entry = entryArr[i];
                if (entry instanceof CommentFrame) {
                    CommentFrame commentFrame = (CommentFrame) entry;
                    if ("iTunSMPB".equals(commentFrame.f11475b) && m9679c(commentFrame.f11476c)) {
                        return;
                    }
                } else if (entry instanceof InternalFrame) {
                    InternalFrame internalFrame = (InternalFrame) entry;
                    if ("com.apple.iTunes".equals(internalFrame.f11482a) && "iTunSMPB".equals(internalFrame.f11483b) && m9679c(internalFrame.f11484c)) {
                        return;
                    }
                } else {
                    continue;
                }
                i++;
            } else {
                return;
            }
        }
    }
}
