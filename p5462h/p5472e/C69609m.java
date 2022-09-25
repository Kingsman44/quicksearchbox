package p5462h.p5472e;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import p5462h.p5463a.C69496am;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69748a;
import p5462h.p5483m.C69764m;

/* renamed from: h.e.m */
/* compiled from: PG */
class C69609m {
    /* renamed from: a */
    public static final C69599c m101022a(File file) {
        int i;
        List list;
        int B;
        C69664n.m101061g(file, "<this>");
        String path = file.getPath();
        C69664n.m101060f(path, "path");
        int B2 = C69764m.m101185B(path, File.separatorChar, 0, 4);
        if (B2 == 0) {
            if (path.length() <= 1 || path.charAt(1) != File.separatorChar || (B = C69764m.m101185B(path, File.separatorChar, 2, 4)) < 0) {
                i = 1;
            } else {
                int B3 = C69764m.m101185B(path, File.separatorChar, B + 1, 4);
                i = B3 >= 0 ? B3 + 1 : path.length();
            }
        } else if (B2 <= 0 || path.charAt(B2 - 1) != ':') {
            if (B2 == -1) {
                C69664n.m101061g(path, "<this>");
                if (path.length() > 0 && C69748a.m101209c(path.charAt(C69764m.m101195o(path)), ':', false)) {
                    i = path.length();
                }
            }
            i = 0;
        } else {
            i = B2 + 1;
        }
        String substring = path.substring(0, i);
        C69664n.m101060f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        String substring2 = path.substring(i);
        C69664n.m101060f(substring2, "this as java.lang.String).substring(startIndex)");
        if (substring2.length() == 0) {
            list = C69496am.f185918a;
        } else {
            List<String> F = C69764m.m101189F(substring2, new char[]{File.separatorChar}, 0, 6);
            ArrayList arrayList = new ArrayList(C69540x.m100804k(F, 10));
            for (String file2 : F) {
                arrayList.add(new File(file2));
            }
            list = arrayList;
        }
        return new C69599c(new File(substring), list);
    }
}
