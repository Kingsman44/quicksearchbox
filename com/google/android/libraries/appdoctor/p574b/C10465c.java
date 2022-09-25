package com.google.android.libraries.appdoctor.p574b;

import android.os.PatternMatcher;
import android.util.Log;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.libraries.appdoctor.b.c */
/* compiled from: PG */
final class C10465c implements FilenameFilter {

    /* renamed from: a */
    List f35222a = new ArrayList();

    public C10465c(File file, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String absolutePath = file.getAbsolutePath();
            String str2 = File.separator;
            Log.i("FILE_DELETION", "Adding glob path: " + absolutePath + str2 + str);
            String replace = str.replace("*", ".*");
            List list2 = this.f35222a;
            String absolutePath2 = file.getAbsolutePath();
            String str3 = File.separator;
            list2.add(new PatternMatcher(absolutePath2 + str3 + replace, 2));
        }
    }

    public final boolean accept(File file, String str) {
        String str2 = file.getAbsolutePath() + File.separator + str;
        for (PatternMatcher patternMatcher : this.f35222a) {
            if (patternMatcher.match(str2)) {
                Log.i("FILE_DELETION", String.format("Deleting file '%s' which matches '%s'", new Object[]{str2, patternMatcher.getPath()}));
                return true;
            }
        }
        return false;
    }
}
