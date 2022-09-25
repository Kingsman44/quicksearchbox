package p5462h.p5472e;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: h.e.p */
/* compiled from: PG */
public class C69612p extends C69611o {
    /* renamed from: b */
    public static final C69599c m101023b(C69599c cVar) {
        File file = cVar.f185998a;
        List<File> list = cVar.f185999b;
        ArrayList arrayList = new ArrayList(list.size());
        for (File file2 : list) {
            String name = file2.getName();
            if (!C69664n.m101066l(name, ".")) {
                if (!C69664n.m101066l(name, "..")) {
                    arrayList.add(file2);
                } else if (arrayList.isEmpty() || C69664n.m101066l(((File) C69540x.m100823E(arrayList)).getName(), "..")) {
                    arrayList.add(file2);
                } else {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
        }
        return new C69599c(file, arrayList);
    }
}
